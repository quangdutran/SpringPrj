package tacos;
import java.util.List;
// end::allButValidation[]
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
// tag::allButValidation[]
import lombok.Data;

@Data
public class Taco {

  // end::allButValidation[]
  @NotNull
  @Size(min=5, message="Name must be at least 5 characters long")
  // tag::allButValidation[]
  private String name;
  // end::allButValidation[]
  @Size(min=1, message="You must choose at least 1 ingredient")
  // tag::allButValidation[]
  private List<String> ingredients;
public Taco(@NotNull @Size(min = 5, message = "Name must be at least 5 characters long") String name,
		@Size(min = 1, message = "You must choose at least 1 ingredient") List<String> ingredients) {
	super();
	this.name = name;
	this.ingredients = ingredients;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getIngredients() {
	return ingredients;
}
public void setIngredients(List<String> ingredients) {
	this.ingredients = ingredients;
}
  
  

}
//end::allButValidation[]
//tag::end[]