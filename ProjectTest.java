public class ProjectTest {
    public static void main(String[] args) {
        // Crear instancia de Project con diferentes constructores
        Project project1 = new Project();
        Project project2 = new Project("Proyecto 1");
        Project project3 = new Project("Proyecto 2", "Descripción del Proyecto 2");

        // Prueba del método elevatorPitch
        System.out.println("Elevator pitch del proyecto 1: " + project1.elevatorPitch());
        System.out.println("Elevator pitch del proyecto 2: " + project2.elevatorPitch());
        System.out.println("Elevator pitch del proyecto 3: " + project3.elevatorPitch());

        // Prueba de los getters y setters
        project1.setName("Proyecto 3");
        project1.setDescription("Descripción del Proyecto 3");

        System.out.println("Nombre del proyecto 1: " + project1.getName());
        System.out.println("Descripción del proyecto 1: " + project1.getDescription());
    }
}

