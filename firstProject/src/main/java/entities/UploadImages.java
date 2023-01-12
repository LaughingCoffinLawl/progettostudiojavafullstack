package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="images_upload")
@Table(name="images_upload")
public class UploadImages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="file_name")
	String fileName;
	
	@Column(name="label")
	String label;
	
	@Column(name="caption")
	String caption;
	
	public UploadImages() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public UploadImages(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "UploadImages [id=" + id + ", fileName=" + fileName + ", label=" + label + ", caption=" + caption + "]";
	}
}
