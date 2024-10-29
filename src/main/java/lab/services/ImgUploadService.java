package lab.services;

import org.springframework.web.multipart.MultipartFile;

import lab.entities.Category;


public interface ImgUploadService {
	void handleFileUpload(MultipartFile image, String imageLink, Category categoryModel, Category oldCategory);
	void handleFileUpload(MultipartFile image, String imageLink, Category categoryModel);

}
