PulgLibrary.jar
为library导出的jar包
在测试工程中引用

PulgLibrary.jar中包含了assets文件夹 里面包含了资源文件 所有资源的引用都是在assets中


测试工程中library是被调用工程 也就是PulgLibrary.jar的生成工程


步骤：
1.新建工程PulgLibrary
(1) 自定义View
(2) 所有资源文件放置到assets文件夹下 图片。txt文档等
(3) activity中的setContentView方法中 引用自定义的View 如果涉及资源图片的引用 则用一个辅助类获取assets内的资源
(4) 运行成功后 将工程导出jar包 在工程上鼠标右击-export-选择工程中的src,assets 文件夹 其他不选
(5) 生成PulgLibrary.jar
2.新建测试Demo
(1)将PulgLibrary.jar 引用到工程中
(2)注册PulgLibrary.jar 中所用到的Activity或者broadcast或者service等需要注册的界面或者权限
(3)测试调用PulgLibrary.jar中的功能 测试通过！

PulgLibrary_Code.jar 为混淆过后的jar包

网上资料颇多，有4种方式 但是只有两种方式比较适合正在抉择中 其中两种方式各有优缺点 都不完美
第一种：将src中的代码打包成jar包 然后将res中的资源文件在另外拷贝至测试工程 
优点：模块代码容易与正常工程同样方式编写 
缺点：需要另外提供一个借口说明文档 给到第三方 麻烦


第二种：将所有资源文件的引用放到assets文件夹下 然后读取assets中的文件 
优点：无需提供两个接口一个jar包搞定所有代码
缺点：因为是在assets中引用资源 所以不能采用Android提供的R.文件来引用 且View都是自定义（个人做法）在复杂的布局中 编程稍微麻烦一点

以上两个方法都可以混淆代码 以实现代码安全性
-----------------------------------------------


librarycode.jar   第一种：动态生成View
librarycode_1.jar  第二种：反射形式获取资源文件


