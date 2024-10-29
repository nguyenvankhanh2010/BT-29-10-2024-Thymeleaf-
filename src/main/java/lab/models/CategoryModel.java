package lab.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryModel implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryId")
    private int categoryId;

    @Column(name = "CategoryName",columnDefinition = "nvarchar(50)")
    @NotEmpty(message = "Không được bỏ trống")
    private String categoryName;

    @Column(name = "Image",columnDefinition = "nvarchar(500)")
    private String image;

    @Column(name = "Status")
    private int status;
}