public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) { // الحلقة الخارجية - تتحكم بعدد الصفوف
            for (int j = 1; j <= i; j++) { // الحلقة الداخلية - تطبع الأرقام في كل صف
                System.out.print(j + " ");
            }
            System.out.println(); // ينزل سطر جديد بعد كل صف
        }
    }
}