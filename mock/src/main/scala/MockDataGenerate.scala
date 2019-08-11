import commons.utils.DateUtils
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
  * 模拟的数据
  * date：是当前日期
  * age: 0 - 59
  * professionals: professional[0 - 59]
  * cities: 0 - 9
  * sex: 0 - 1
  * keywords: ("火锅", "蛋糕", "重庆辣子鸡", "重庆小面", "呷哺呷哺", "新辣道鱼火锅", "国贸大厦", "太古商场", "日本料理", "温泉")
  * categoryIds: 0 - 99
  * ProductId: 0 - 99
  */

object MockDataGenerate {
  //模拟用户行为信息
  private def mockUserVisitActionData(): Unit = {
    val searchKeywords = Array("华为手机", "联想笔记本", "小龙虾", "卫生纸", "吸尘器", "Lamer", "机器学习", "苹果", "洗面奶", "保温杯")
    //yyy-MM-dd
    val date = DateUtils.getTodayDate()
  }





  /**
    * 主入口方法
    *
    * @param args 启动参数
    */
  def main(args: Array[String]): Unit = {
    //创建spark配置
    val sparkConf = new SparkConf().setAppName("MockDate").setMaster("local[*]")

      //创建sparkSql客户端
    val spark = SparkSession.builder().config(sparkConf).enableHiveSupport().getOrCreate()

    //模拟数据
    val userVisitActionData = this.mockUserVisitActionData()
  }
}
