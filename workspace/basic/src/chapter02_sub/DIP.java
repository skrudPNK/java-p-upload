package chapter02_sub;

class Controller {
	
	Service service = new Service(null);
	
	void controllerMethod() {
		System.out.println("Controller A");
		service.serviceMethod();
	}
	
	void controllerMethod2() {
		System.out.println("Controller A2");
		service.serviceMethod2();
	}
	
	Controller(Service service){
		this.service = service;
	}
	
}

class Service {

	Repository repository = new Repository(); // 의존성 주입
	
	void serviceMethod() {
		System.out.println("Service A");
		repository.repositoryMethod();
	}
	void serviceMethod2() {
		System.out.println("Service A2");
		repository.repositoryMethod2();
	}
	
	Service(Repository repository){
		this.repository = repository;
	}
	
}

class Repository {
	void repositoryMethod() {
		System.out.println("A");
	}
	void repositoryMethod2() {
		System.out.println("A2");
	}
}

public class DIP {

	public static void main(String[] args) {

		Repository repository = new Repository();
		Service service = new Service(repository);
		Controller controller = new Controller(service);
		
		controller.controllerMethod();
		controller.controllerMethod2();

	}

}
