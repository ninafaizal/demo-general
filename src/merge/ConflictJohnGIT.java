package merge;

//TODO: DevOps Day1:Practical 2

// From your own repository,  create conflict by having a method returning different value between branch and main
// Assuming you are not working on the method but need to sync with Main branch
// You should not overwrite the value from the Main branch

// On branch, return branch String value from getConflict()
// On Main, return main String value from getConflict()

// Expectation, branch should take the changes from Main
// Ensure you creating filename with your name
public class ConflictJohnGIT {

	public String getConflict() {
		return "branch updates 0.1";
	}

}
