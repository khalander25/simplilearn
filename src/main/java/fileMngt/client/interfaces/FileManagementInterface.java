package fileMngt.client.interfaces;

import java.util.Scanner;

public interface FileManagementInterface {
   void showMainScreen();
   void displayInterface();

   void displayFileNamesAscending();

   void displayFileManagementOptions(Scanner scanner);
}
