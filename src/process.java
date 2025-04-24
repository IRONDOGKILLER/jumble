public class process {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new guiBuilder().createUIComponents();
            }
        });
    }
}
