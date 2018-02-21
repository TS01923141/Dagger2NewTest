# Dagger2NewTest
Test Dagger2.10~ new construction, simplify Car.java, continued to Dagger2Test4   
測試Dagger2 2.10版之後的實作方式  

## 內容 ##
  Car:MainActivity所需要的class   
  MainApp:Application，MainActivity的父類別，最後將注入(Inject)此處，其他class都將跟Application要需要的資源  
  MainAppComponent:Module跟App的中介，提供給App將Module注入的方法   
  MainAppModule:提供App中需要的資源   
  ActivityBuilder:取代之前的子類別Component，ex.CarComponent，用來告訴Dagger該Activity需要用到那些子類別Module    
  MainActivityModule:提供Activity中需要的資源   
  MainActivity:從App注入需要的資源  
  
## 結果 ##
MainApp繼承DaggerApplication，創建MainAppComponent並回傳，自動將資料注入MainActivity(繼承DaggerAppCompatActivity)   
Log會顯示創建的class
