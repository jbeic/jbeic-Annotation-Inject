<html  >
<head>
<meta charset="gb2312">
</head>
<body style="tab-interval:36pt; text-justify-trim:punctuation; " >
<div class="Section0" >
<h3 style="margin-top:7.0000pt; margin-right:0.0000pt; margin-bottom:1.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:0.0000pt; mso-char-indent-count:0.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:center; mso-outline-level:3; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:16.0000pt; mso-font-kerning:1.0000pt; " >注解式依赖注入</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:16.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</h3>
<h3 style="margin-top:7.0000pt; margin-right:0.0000pt; margin-bottom:1.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:0.0000pt; mso-char-indent-count:0.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:center; mso-outline-level:3; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:16.0000pt; mso-font-kerning:1.0000pt; " >JBeic-Annotation-Inject</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:16.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</h3>
<h3 style="margin-top:13.0000pt; margin-right:0.0000pt; margin-bottom:13.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:0.0000pt; mso-char-indent-count:0.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:justify; text-justify:inter-ideograph; mso-outline-level:3; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >1<font face="宋体" >、简介</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</h3>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeic-Annotation-Inject</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >是基于<font face="Times New Roman" >Java</font>
<font face="宋体" >注解</font>
<font face="Times New Roman" >Annotation</font>
<font face="宋体" >和</font>
<font face="Times New Roman" >Java</font>
<font face="宋体" >反射机制进行实现，通过简单的注解方式实现灵活的依赖注入。</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<h3 style="margin-top:13.0000pt; margin-right:0.0000pt; margin-bottom:13.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:0.0000pt; mso-char-indent-count:0.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:justify; text-justify:inter-ideograph; mso-outline-level:3; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >2<font face="宋体" >、优点</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</h3>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeic-Annotation-Inject<font face="宋体" >依赖注入主要有两个好处：</font>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >
<br></span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(1)</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >解耦，将依赖之间解耦。</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >
<br></span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(2)</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >方便做单元测试。</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(3)&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >依赖的类无需实现对依赖的类实例化（不需要构造函数和公有方法对依赖的类注入对象）。</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<h3 style="margin-top:13.0000pt; margin-right:0.0000pt; margin-bottom:13.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:0.0000pt; mso-char-indent-count:0.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:justify; text-justify:inter-ideograph; mso-outline-level:3; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >3<font face="宋体" >、主要</font>
<font face="Times New Roman" >API</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</h3>
<p class=MsoNormal  style="margin-right:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; padding:0pt 0pt 0pt 0pt ; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >1<font face="宋体" >、</font>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >void&nbsp;</span>
<span>
<a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >com</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >jbeic</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >AnnotationInject</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.inject(</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject~inject~QObject;~QObject;%E2%98%82Object" ><span style="mso-spacerun:'yes'; font-family:'Time
s New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Object</span>
</a>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;sourceObject,&nbsp;</span>
<span>
<a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject~inject~QObject;~QObject;%E2%98%82Object" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Object</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;injectObject)</span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " ></span></p><p class=p  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >将主对象<font face="Times New Roman" >sourceObject</font><font face="宋体" >中的某个依赖的对象用</font><font face="Times New Roman" >injectObject</font><font face="宋体" >对象进行注入&nbsp;如果主对象有依赖多个相同类的属性，则会自动注入第一个对象，所以请使用</font><font face="Times New Roman" >inject(Object&nbsp;sourceObject,String&nbsp;fieldName,Object&nbsp;injectObject)</font><font face="宋体" >或</font><font face="Times New Roman" >inject(Object&nbsp;sourceObject,int&nbsp;index,Object&nbsp;injectObject)&nbsp;</font></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " ></span></p><p class=MsoNo
rmal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Parameters</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >:&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >sourceObject&nbsp;<font face="宋体" >主对象&nbsp;</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >fieldName&nbsp;<font face="宋体" >类的属性名称&nbsp;</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >injectObject&nbsp;<font face="宋体" >依赖的对象</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-right:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<p class=MsoNormal  style="margin-right:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; padding:0pt 0pt 0pt 0pt ; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >2<font face="宋体" >、</font>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >void&nbsp;</span>
<span>
<a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >com</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >jbeic</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >AnnotationInject</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.inject(</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject~inject~QObject;~QString;~QObject;%E2%98%82Object" ><span style="mso-spacerun:'yes'; font-fam
ily:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Object</span>
</a>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;sourceObject,&nbsp;</span>
<span>
<a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject~inject~QObject;~QString;~QObject;%E2%98%82String" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >String</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;fieldName,&nbsp;</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject~inject~QObject;~QString;~QObject;%E2%98%82Object" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Object</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;injectObject)</span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " ></span></p><p class=MsoNormal  style="margin-right:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " ><o:p>&nbsp;</o:p></span></p><p class=p  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd;
 mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >有依赖多个相同类的属性时，将主对象<font face="Times New Roman" >sourceObject</font>
<font face="宋体" >中的属性名称为</font>
<font face="Times New Roman" >fieldName</font>
<font face="宋体" >依赖的对象用</font>
<font face="Times New Roman" >injectObject</font>
<font face="宋体" >对象进行注入&nbsp;</font>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Parameters:&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >sourceObject&nbsp;<font face="宋体" >主对象&nbsp;</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >fieldName&nbsp;<font face="宋体" >类的属性名称&nbsp;</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >injectObject&nbsp;<font face="宋体" >依赖的对象</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=p  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<p class=MsoNormal  style="margin-right:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; padding:0pt 0pt 0pt 0pt ; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >3<font face="宋体" >、</font>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >void&nbsp;</span>
<span>
<a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >com</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >jbeic</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >AnnotationInject</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.inject(</span><span><a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject~inject~QObject;~I~QObject;%E2%98%82Object" ><span style="mso-spacerun:'yes'; font-family:'Ti
mes New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Object</span>
</a>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;sourceObject,&nbsp;int&nbsp;index,&nbsp;</span>
<span>
<a href="eclipse-javadoc:%E2%98%82=jbeicAnnotationInject/src<com.jbeic.AnnotationInject{JBeicInject.java%E2%98%83JBeicInject~inject~QObject;~I~QObject;%E2%98%82Object" ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Object</span></a></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;injectObject)</span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " ></span></p><p class=p  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " ><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >有依赖多个相同类的属性时，将主对象<font face="Times New Roman" >sourceObject</font><font face="宋体" >中的第</font><font face="Times New Roman" >index-1</font><font face="宋体" >个相同类依赖的对象用</font><font face="Times New Roman" >injectObject</font><font face="宋体" >对象进行注入。&nbsp;</font><font face="Times New Roman" >index</font><font face="宋体" >从</font><font face="Times New Roman" >0</font><font face="宋体" >开始&nbsp;</font></span><span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " ></span></p><p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000
pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Parameters:&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >sourceObject&nbsp;<font face="宋体" >主对象&nbsp;</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >index&nbsp;<font face="宋体" >标记位&nbsp;</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >injectObject&nbsp;<font face="宋体" >依赖的对象</font>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; color:rgb(0,0,0); font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-right:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<h3 style="margin-top:13.0000pt; margin-right:0.0000pt; margin-bottom:13.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:justify; text-justify:inter-ideograph; mso-outline-level:3; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >4<font face="宋体" >、例子</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</h3>
<p class=MsoNormal  style="margin-right:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; mso-pagination:widow-orphan; text-align:justify; text-justify:inter-ideograph; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Student<font face="宋体" >类依赖了</font>
<font face="Times New Roman" >Book</font>
<font face="宋体" >、</font>
<font face="Times New Roman" >Pen</font>
<font face="宋体" >、</font>
<font face="Times New Roman" >int</font>
<font face="宋体" >、</font>
<font face="Times New Roman" >String</font>
<font face="宋体" >等。使用</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject.inject</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >去注入这些依赖。</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<table class=MsoTableGrid  style="border-collapse:collapse; width:409.0000pt; mso-table-layout-alt:fixed; mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; " >
<tr style="height:14.7500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:0.5000pt solid windowtext; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Book接口</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
<tr style="height:52.4500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:none; ; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >interface</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Book&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:Consolas; mso-hansi-font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;&nbsp;&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;String&nbsp;&nbsp;toString();</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
</table>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<table class=MsoTableGrid  style="border-collapse:collapse; width:409.0000pt; mso-table-layout-alt:fixed; mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; " >
<tr style="height:14.7500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:0.5000pt solid windowtext; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >CBook</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >类实现</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Book&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >接口</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
<tr style="height:52.4500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:none; ; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >class</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;CBook&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >implements</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Book&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Override</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;String&nbsp;toString()&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >return</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"C&nbsp;BOOK"</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
</table>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<table class=MsoTableGrid  style="border-collapse:collapse; width:409.0000pt; mso-table-layout-alt:fixed; mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; " >
<tr style="height:14.7500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:0.5000pt solid windowtext; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JavaBook</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >类实现</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Book&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >接口</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
<tr style="height:52.4500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:none; ; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >class</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;JavaBook&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >implements</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Book&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Override</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;String&nbsp;toString()&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >return</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"JAVA&nbsp;BOOK"</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
</table>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<table class=MsoTableGrid  style="border-collapse:collapse; width:409.0000pt; mso-table-layout-alt:fixed; mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; " >
<tr style="height:14.7500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:0.5000pt solid windowtext; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Pen</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >类</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
<tr style="height:52.4500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:none; ; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >class</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Pen&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >private</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;String&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >nameString</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Pen(String&nbsp;nameString)&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >this</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >nameString</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;=&nbsp;nameString;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Override</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;String&nbsp;toString()&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >return</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"Pen:"</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;+&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >nameString</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
</table>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<table class=MsoTableGrid  style="border-collapse:collapse; width:409.0000pt; mso-table-layout-alt:fixed; mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; " >
<tr style="height:14.7500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:0.5000pt solid windowtext; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Student&nbsp;</span>
<span style="font-family:宋体; mso-ascii-font-family:Consolas; mso-hansi-font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >类</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
<tr style="height:52.4500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:none; ; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >class</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Student&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Inject</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >private</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Pen&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >pen</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Inject</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >private</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Pen&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >pen2</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Inject</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >private</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Book&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >book</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Inject</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >private</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >int</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >myint</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Inject</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >private</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;String&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >name</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Inject</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >private</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;String&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >age</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Inject</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >private</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >double</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >money</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Inject</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >private</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;List&#60;Book&#62;&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >bookList</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(100,100,100); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >@Override</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;String&nbsp;&nbsp;toString(){</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >return</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"Student:"</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >pen</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.toString()+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >","</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >pen2</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.toString()+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >","</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >book</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.toString()+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >","</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >myint</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"--"</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >name</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"--"</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >age</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"--"</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >money</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"--"</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >+</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >bookList</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.toString();</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
</table>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<table class=MsoTableGrid  style="border-collapse:collapse; width:409.0000pt; mso-table-layout-alt:fixed; mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; " >
<tr style="height:4.5000pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:0.5000pt solid windowtext; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInjectMain&nbsp;程序入口</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
<tr style="height:52.4500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:none; ; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >class</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;JBeicInjectMain&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >public</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >static</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >void</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;main(String[]&nbsp;args)&nbsp;{</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Student&nbsp;student=</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >new</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Student();</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >//直接注入，适合只有一个该Class的属性</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >inject</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(student,&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >new</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;JavaBook());</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >//根据属性名注入，适合多个相同Class的属性</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Pen&nbsp;pen=</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >new</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Pen(</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"JBeic-pan"</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >);</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Pen&nbsp;pen2=</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >new</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;Pen(</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"JBeic-pan2"</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >);</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >//注入自定义类型对象</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >inject</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(student,&nbsp;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"pen"</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >,pen);</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >inject</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(student,</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"pen2"</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >,&nbsp;pen2);</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >//</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); text-decoration:underline; text-underline:single; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >int</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >、double、float等自动进行装箱和拆箱</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >//注入double类型</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >inject</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(student,</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"money"</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >,&nbsp;1000.156);</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >//注入Integer类型</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >inject</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(student,&nbsp;Integer.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >valueOf</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(12354));</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >//注入String类型</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >inject</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(student,</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"name"</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >,</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"Jbeic&#8212;&#8212;name"</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >);</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >//根据属性的位置进行注入，位置参数从0开始</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >inject</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(student,5,</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"Jbeic&#8212;&#8212;index"</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >);</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(63,127,95); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >//注入List类型</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >List&#60;Book&#62;&nbsp;books=</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >new</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;ArrayList&#60;Book&#62;();</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >books.add(</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >new</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;CBook());</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >books.add(</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(127,0,85); font-weight:bold; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >new</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&nbsp;JavaBook());</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >JBeicInject.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >inject</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >(student,</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(42,0,255); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >"bookList"</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >,books);</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >System.</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,192); font-style:italic; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >out</span>
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >.println(student.toString());</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >&#9;</span>
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="mso-para-margin-top:0.0000gd; mso-para-margin-bottom:0.0000gd; text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >}</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
</table>
<p class=MsoNormal  style="margin-top:13.0000pt; margin-right:0.0000pt; margin-bottom:13.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:0.0000pt; mso-char-indent-count:0.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:justify; text-justify:inter-ideograph; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<table class=MsoTableGrid  style="border-collapse:collapse; width:409.0000pt; mso-table-layout-alt:fixed; mso-padding-alt:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; " >
<tr style="height:4.5000pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:0.5000pt solid windowtext; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >执行结果：</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
<tr style="height:52.4500pt; " >
<td width=545  valign=top  style="width:409.0000pt; padding:0.0000pt 5.4000pt 0.0000pt 5.4000pt ; border-left:0.5000pt solid windowtext; mso-border-left-alt:0.5000pt solid windowtext; border-right:0.5000pt solid windowtext; mso-border-right-alt:0.5000pt solid windowtext; border-top:none; ; mso-border-top-alt:0.5000pt solid windowtext; border-bottom:0.5000pt solid windowtext; mso-border-bottom-alt:0.5000pt solid windowtext; " >
<p class=MsoNormal  style="text-align:justify; text-justify:inter-ideograph; " >
<span style="mso-spacerun:'yes'; font-family:Consolas; color:rgb(0,0,0); font-size:12.0000pt; mso-font-kerning:1.0000pt; " >Student:Pen:JBeic-pan,Pen:JBeic-pan2,JAVA&nbsp;BOOK,12354--Jbeic&#8212;&#8212;name--Jbeic&#8212;&#8212;index--1000.156--[C&nbsp;BOOK,&nbsp;JAVA&nbsp;BOOK]</span>
<span style="font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
</td>
</tr>
</table>
<p class=MsoNormal >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
<h3 style="margin-top:13.0000pt; margin-right:0.0000pt; margin-bottom:13.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:0.0000pt; mso-char-indent-count:0.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:justify; text-justify:inter-ideograph; mso-outline-level:3; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:14.0000pt; mso-font-kerning:1.0000pt; " >5<font face="宋体" >、展望</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:bold; font-size:16.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</h3>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >1<font face="宋体" >、目前没有对构造函数和方法进行注解方式的依赖注解，后续将增加这些功能。</font>
</span>
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="margin-top:0.0000pt; margin-right:0.0000pt; margin-bottom:0.0000pt; margin-left:0.0000pt; mso-para-margin-top:0.0000gd; mso-para-margin-right:0.0000gd; mso-para-margin-bottom:0.0000gd; mso-para-margin-left:0.0000gd; text-indent:24.0000pt; mso-char-indent-count:2.0000; text-autospace:ideograph-numeric; page-break-after:avoid; mso-pagination:widow-orphan lines-together; text-align:left; line-height:20.0000pt; mso-line-height-rule:exactly; " >
<span style="mso-spacerun:'yes'; font-family:宋体; mso-ascii-font-family:'Times New Roman'; mso-hansi-font-family:'Times New Roman'; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >2<font face="宋体" >、注解</font>
<font face="Times New Roman" >@Inject</font>
<font face="宋体" >应该增加一个值来标记该注解是否可用，值为</font>
<font face="Times New Roman" >false</font>
<font face="宋体" >时该字段不能进行注入对象。</font>
</span>
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-weight:normal; font-size:12.0000pt; mso-font-kerning:1.0000pt; " >

</span>
</p>
<p class=MsoNormal  style="text-align:left; " >
<span style="mso-spacerun:'yes'; font-family:'Times New Roman'; mso-fareast-font-family:宋体; font-size:10.5000pt; mso-font-kerning:1.0000pt; " >
<o:p>&nbsp;</o:p>
</span>
</p>
</div>
<!--EndFragment-->
</body>
</html>
