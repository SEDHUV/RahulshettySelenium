package fileUpload;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

public class fileUpload_download {
    public static void main(String[] args) throws InterruptedException, IOException {
        String fruit ="Apple";
        String filename  ="C:\\Users\\SEDHU\\Downloads\\download.xlsx";
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("downloadButton")).click();
        int col = getcolumnNum(filename,"price");
        int row = getRowNum(filename,"Apple");

        Assert.assertTrue(updatecell(filename,row,col,"599"));
       WebElement upload =  driver.findElement(By.xpath("//div[@class='buttons-box']/input[@id='fileinput']"));
       //Thread.sleep(5000);
       upload.sendKeys(filename);
      By successmsg = By.xpath("//div[@class='Toastify__toast-body']/div[2]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(successmsg));
        String ele = driver.findElement(successmsg).getText();
        System.out.println(ele);
        Assert.assertEquals(ele,"Updated Excel Data Successfully.");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(successmsg));
        String pricecolumnNum = driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
       String fruitPrice =  driver.findElement(By.xpath("//div[text()='"+fruit+"']/parent::div/parent::div/div[@id='cell-"+pricecolumnNum+"-undefined']")).getText();
System.out.println(fruitPrice);
Assert.assertEquals("599",fruitPrice);
    }

    private static int getRowNum(String filename,String text) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Iterator<Row> rows = sheet.iterator();
        int k =1;
        int rowindex =1;
        while (rows.hasNext()){
           Row row =  rows.next();
           Iterator<Cell> cells =  row.cellIterator();
           while (cells.hasNext()){
               Cell cell = cells.next();
               if(cell.getCellType()==CellType.STRING && cell.getStringCellValue().equalsIgnoreCase(text)){
                 rowindex =k;
               }

           }
            k++;
        }
        System.out.println(rowindex);
        return rowindex;

    }
    private static int getcolumnNum(String filename,String colname) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Iterator<Row> row = sheet.iterator();
         Row firstrow = row.next();
         Iterator<Cell> cell = firstrow.cellIterator();
         int k =1;
         int column =0;
        while (cell.hasNext()){
            Cell value =  cell.next();
            if(value.getStringCellValue().equalsIgnoreCase(colname)){
                //onmce purchase identified grab all the data in the cells and fed in our test
               column =k;
            }

            }
        System.out.println(column);
        return column;
        }
        private static boolean updatecell(String filename, int row, int col, String updatedvalue) throws IOException {
            FileInputStream fis = new FileInputStream(filename);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");
           Row rowfield =  sheet.getRow(row-1);
           Cell ce = rowfield.getCell(col-1);
           ce.setCellValue(updatedvalue);
            FileOutputStream fos = new FileOutputStream(filename);
            xssfWorkbook.write(fos);
            xssfWorkbook.close();
            fis.close();
            return true;
        }
    }

