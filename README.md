# SuperAdapter 
### 使用方式  
    1.拷贝Utils目录的下SuperViewHolder和SuperAdapter至自己的项目中  
    2.自定义Adapter继承自SuperAdapter并重写其中的抽象方法或者使用匿名内部类创建一个SuperAdapter对象。  
    3.可以通过convert方法参数1的holder.getView()获取控件，参数2为数据源当前position的javaBean对象。  
### 可拓展使用方式  
    在ViewHolder中可以自定义方法，使代码更加简洁  
####示例  

    public SuperViewHolder setText(int viewId, String text) {
         ((TextView) this.getView(viewId)).setText(text);
        return this;
    }

    public SuperViewHolder setOnClickListener(int viewId,View.OnClickListener listener){
        this.getView(viewId).setOnClickListener(listener);
        return this;
    }
    
### 总结  
  可以使代码精简90%，方法可灵活拓展。
  
### 关于我
  
个人邮箱：DeveloperSKY@163.com

[GitHub主页](https://github.com/ITDreamSKY)

[个人博客](http://blog.csdn.net/lty406910111)
