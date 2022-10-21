package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOI_Start {
    public static void main(String[] args) throws IOException {
        //dosyanın yolu alındı
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        // String path="src\\test\\java\\ApachePOI\\resource\\ApacheExcel2.xlsx";  bazen linkler böylede yazılabiliyor.

        // Dosya okuma işlemcisine dosyanın yolunu veriyoruz: böylece program ile dosya arasında bağlantı
        // JavaDosya okuma işlemcisine dosyanın yolunu veriyoruz.
        // böylece proğram ile dosya arasında bağlantı oluştu

        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

        // Dosya okuma işlemcisi üzerinden çalışma kitabını alıyorum.
        // hafızada workbook u alıp oluşturdu.

        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");

        // Sheet calismaSayfasi=calismaKitabi.getSheetAt(0)
        Row satir=calismaSayfasi.getRow(0);

        // istenen satırdaki istenen hücre alınıyor
        Cell hucre=satir.getCell(0);

        System.out.println("Hücre= "+hucre);

    }
}
