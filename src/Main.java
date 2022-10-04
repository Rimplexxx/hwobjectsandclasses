public class Main {

    public static void main(String[] args) {
        Author alexanderPushkin = new Author("Александр", "Пушкин");
        Book rusalka = new Book("Русалка", alexanderPushkin, 1737);
        System.out.println("Книга: " + rusalka.getTitle());
        System.out.println("Автор: " + alexanderPushkin.getName() + " " + alexanderPushkin.getSurname());
        System.out.println("Год публикации: " + rusalka.getPublicationYear());
        rusalka.setPublicationYear(1837);
        System.out.println("Год публикации: " + rusalka.getPublicationYear()); //изменил год

        Author nikolaiGogol = new Author("Николай", "Гоголь");
        Book tarasBulba = new Book("Тарас Бульба", nikolaiGogol, 1835);
        System.out.println("Книга: " + tarasBulba.getTitle());
        System.out.println("Автор: " + nikolaiGogol.getName() + " " + nikolaiGogol.getSurname());
        System.out.println("Год публикации: " + tarasBulba.getPublicationYear());
    }
}