interface USB{//USB定义了标准，具有read和write两个方法，具体实现由子类阿里复写实现
	void read();//java中不声明权限默认为default，但是接口是一个例外，如果不写，默认为public
	void write();
}  