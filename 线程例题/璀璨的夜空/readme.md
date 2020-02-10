  1.Person类中包含3属性：private int id;	private int state;	private Point location = new Point();
  
  2.状态接口定义：
  
    interface State{
    
      int NORMAL = 0;
      
      int SUSPECTED = NORMAL+1;
      
      int SHADOW = SUSPECTED+1;
      
      int CONFIRMED = SHADOW+1;
      
      int FREEZE = CONFIRMED+1;
      
     }

3.  PersonPool类中包含一个Person类型的list
  
4.  Mypanel extends JPanel implements Runnable,每秒钟一刷新，每刷新一下更改list中每一个Person对象的状态机，并刷屏显示。
