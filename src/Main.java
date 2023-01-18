public class Main {
    public static void main(String[] args) {
        try{
            throw new ExampleException("Что-то пошло не так!");
        } catch (ExampleException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}