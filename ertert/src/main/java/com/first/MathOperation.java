package com.first;

public class MathOperation {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		MathOperation mo = new MathOperation();
		System.out.println("Add:\t" + mo.add(5, 5));
		System.out.println("Sub:\t" + mo.sub(5, 5));
		System.out.println("Mul:\t" + mo.mul(5, 5));
	}

}
//ALWAYS DO: Project Name => Maven => Update Project.
/*
 * Life cycle.
 * 
 * 1. Validation => checks pom.xml => correctness.
 * 2. Compile => compile source code => binary artifact.
 *  	//mvn compile
 * 3. test => execute unit test.
 * 		//mvn test
 * 4. package => compiled code => archive file.
 * 5. integration test => executes additional test => selenium test cases/cucumber test
 * 6. verify => check package
 * 7. install => install package => local maven repository
 *		//mvn install
 * 8. deploy => deploys package into remote server repository
 *  	//mvn deploy
 *  
 *  
 * 3 ways to CREATE a maven project.
 * 		1. IDE
 * 		2. cmd => non-interactive mode
 * 		3. cmd => interactive mode
 * 
 * 
 */



