public class Main {
    public static String[] model = new String[10];

    public static void main(String[] args) {
      model[0] = "Bangun";
      model[1] = "Sahur";
      addTodoList("Makan");
      addTodoList("Minum");

      boolean isRemove = removeTodoList(4);
        if(isRemove){
            showTodoList();
        } else {
            System.out.println("gagal remove");
        }

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
    public static void addTodoList(String todo) {
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * menghapus todo
     */
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else {
            model[number - 1] = null;
            return true;
        }
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