package lab.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class DownloadImgController {
	  private static final String UPLOAD_DIR = System.getProperty("user.dir") + "/uploads";
	  private  ResourceLoader resourceLoader;

	    public DownloadImgController(ResourceLoader resourceLoader)
	    {
	        this.resourceLoader = resourceLoader;
	    }
	    @GetMapping("/image")
	    public ResponseEntity<InputStreamResource> downloadImage(@RequestParam("filename") String fileName)
	    {
	        File file = new File(UPLOAD_DIR + "/" + fileName); 

	        if (!file.exists())
	        {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	        }

	        try {
	            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
	            return ResponseEntity.ok()
	                    .header(HttpHeaders.CONTENT_TYPE, "image/jpeg")
	                    .body(resource);
	        } catch (FileNotFoundException e) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	        }
	    }
}
