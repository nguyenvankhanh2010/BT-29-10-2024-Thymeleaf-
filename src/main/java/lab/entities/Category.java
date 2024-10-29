package lab.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="categories")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CategoryId")
	private int categoryId;
	
	@Column(name="CategoryName",columnDefinition = "nvarchar(50)")
	@NotEmpty(message = "khong duoc bo trong")
	private String categoryName;
	
	@Column(name="Image",columnDefinition = "nvarchar(500)")
	private String image;
	
    @Column(name = "Status")
	private int status;
	
	
	

}
