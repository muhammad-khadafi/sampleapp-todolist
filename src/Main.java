public class Main {
    public static String[] model = new String[10];
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * menampilkan todolist
     */
    public static void showTodoList() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    /**
     * menambah todo
     */
    public static void addTodoList() {

    }

    /**
     * menghapus todo
     */
    public static void removeTodoList() {

    }

    /**
     * view menampilkan todolist
     */
    public static void viewShowTodoList() {

    }

    /**
     * view menambah todo
     */
    public static void viewAddTodoList() {

    }

    /**
     * view menghapus todo
     */
    public static void viewRemoveTodoList() {

    }

}