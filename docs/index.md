<html>
<head>
    <title>Quickjava - java procedural programming preprocessor</title>
</head>
<body>
    <section class="content">

<p>0) INTRODUCTION</p>

<p>Quickjava is simple learning tool, a Java procedural (simulated) language. Java is a object 
oriented programming language and you need to explain a procedural language for novice or 
beginner coder first. You can use quickjava to simply java learning, 
and studying java sintax in a classic procedural style. Anyway all simple java program 
can be written in Quickjava and used every day without problem (console programs, etc..).</p>

<p>1) MINIMAL REQUIREMENTS</p>

<p>GNU/Linux - Unix:</p>

<ul>
<li>Bash or equivalent shell</li>
<li>GNU Make</li>
<li>Oracle JDK and JRE packages or Openjdk</li>
</ul>

<p>Microsoft Windows:</p>

<ul>
<li>Cygwin with Bash, Gnu/Make and base unix bin</li>
<li>Oracle JDK and JRE packages or Openjdk</li>
<li>Notepad++ to write programs (it&#39;s better than classic windows notepad)</li>
</ul>

<p>2) INSTALLATION</p>

<p>When installed dependencies (java compilers and make), you can install quickjava 
following next instructions:</p>

<p>2.1) GNU/LINUX - UNIX: 
     extract quickjava package to home directory</p>

<p>2.1.1) Set JDK_PATH, JRE_PATH, JAR_PATH in conf/config.cfg.
       if have installed openjdk into your home then JDK_PATH=~/openjdk/bin/
       else leave empty these values if you have installed into default system path
       (in more linux distros you can install openjdk from a package manager)</p>

<p>2.1.2) Run chmod update-env and run the script to configure:</p>

<pre>  
user@hostname ~/quickjava $ chmod +x update-env
user@hostname ~/quickjava $ ./update-env
Created conf/global.cfg
Created conf/make.hd
Generating Makefile..OK
Makefile found
</pre>       

<p>Everything should be ready to start now. </p>

<p>2.2) MICROSOFT WINDOWS: 
     NB: Cygwin doesn&#39;t work under NT4 and quickjava doesn&#39;t work without cygwin..
         You need 2k+ windows version (I think this isn&#39;t a problem ;))</p>

<p>2.2.1) Install Oracle JDK and JRE. If JDK binaries doesn&#39;t work, update windows PATH 
       file adding JDK path (example c:\program files\java\jdk-\bin) 
       (Right click) on Computer-&gt;Properties-&gt;Advanced-&gt;Environment Variables</p>

<p>2.2.2) Install Cygwin into your windows system with Bash, Make, and Base binaries. After 
       install a good text editor (I prefer Notepad++, it&#39;s opensource)</p>

<p>2.2.3) Open C:\Cygwin\home&lt;user&gt; directory and extract quickjava package inside
       ( it&#39;s your windows current user)</p>

<p>2.2.4) Run Cygwin and type next commands into terminal:</p>

<pre><code>   user@hostname ~/ $ cd quickjava

   user@hostname ~/quickjava $ chmod +x update-env

   user@hostname ~/quickjava $ ./update-env
   Created conf/global.cfg
   Created conf/make.hd
   Generating Makefile..OK
   Makefile found

   Everything should be ready to start now.
</code></pre>

<p>3) HOW TO WRITING THE FIRST QUICKJAVA PROGRAM: HELLO WORLD</p>

<p>3.1) Open terminal, go into quickjava directory and create new project into workspace:</p>

<pre><code> user@hostname ~/quickjava $ make new PRJ=my_project
 Creating main.java..OK
 Generating Makefile..OK
 Makefile found
 Project my_project created into directory workspace 
 Copying libs to workspace/my_project/lib/ ...OK
</code></pre>

 Now you can find your project into folder workspace/. We must edit main() function
 into workspace/my_project/main.java file. To write on screen use default java statement
 System.out.print() or System.out.println().
 This is final code into main.java:
<pre><code>
 void main(String[] args)
 {
  System.out.print(&#34;Hello Word!\n&#34;);
 }
</code></pre>

 We can run with &#39;make run PRJ=my_project&#39; in terminal:
<pre><code>
 lele@ema-notebook ~/quickjava $ make run PRJ=my_project
 Removing old class files..OK
 Removing old java files..OK
 Creating Java code from quickjava sources..OK
 Creating class files..OK
 Creating jar files..OK
 Removing old class files..OK
 Running..

 Hello Word!
 QuickJava program terminated successfully.
</code></pre>

 The compiled jar file is present into build/Main.jar inside 
 my_project directory in workspace. The &#34;translated&#34; java file 
 is present into jsrc/ directory.


<p>4) HOW TO READ INPUT FROM KEYBOARD
     To read from standard input we can use Input.get(). Example to read string we can use</p>

<pre><code> String name=Input.getString();

 Example to read integer number we can use

 int number;
 number=Input.getInt();

 This a simple way to read from keyboard all supported types like boolean, byte, short, long,...
</code></pre>

<p>5) HELLO WORD WITH PARAMETRES
     Quickjava support reading arguments from command line with option PARAMS= in &#39;make run&#39;.</p>

<pre><code> user@hostname ~/quickjava $ make new PRJ=my_project_params
 Creating main.java..OK
 Generating Makefile..OK
 Makefile found
 Project my_project_params created into directory workspace 
 Copying libs to workspace/my_project_params/lib/ ...OK 

 Let&#39;s write a simple program print the first argument on screen:

 void main(String[] args)
 {
  if (args.length&gt;0) 
      System.out.println(&#34;First argument is &#34;+args[0]);
  else 
      System.out.println(&#34;No parametres from command line&#34;);
 }

 We run this with &#39;make run&#39; and PARAMS:

 lele@ema-notebook ~/quickjava $ make run PRJ=my_project_params PARAMS=&#39;hello1 hello2&#39;
 Removing old class files..OK
 Removing old java files..OK
 Creating Java code from quickjava sources..OK
 Creating class files..OK
 Creating jar files..OK
 Removing old class files..OK
 Running..

 First argument is hello1
 QuickJava program terminated successfully.

 We can see first argument (hello1) on screen.
</code></pre>

<p>6) FUNCTIONS AND EXTERNAL FILES
    You can write a function in quickjava like classic java:</p>

<pre><code>&lt;TYPE_TO_RETURN&gt; &lt;method_name&gt;(&lt;parametres&gt;)
{
  &lt;statements&gt;
}

example if you want to sum two integer values:

int sum(int a, int b)
{
    return a+b;
}

you can call this function in classic way. Example:

void main(Strings args)
{
 System.out.println(sum(2,5));
}

This program print 7 value on console. You can write sum 
function into external file and call it by &#39;external&#39; 
statement. This isn&#39;t a java statement but it&#39;s a macro used
by Jtiny to load code from external file, like include in C 
and C++ languages.
example: if you save sum function in sum.java file, you can
         call it in this way: 

         external sum.java;

Quickjava replace this statement with statements present 
    into sum.java file (in this case sum function).
</code></pre>

<p>7) LICENSE AND USE LIMITS
    Quickjava is opensource and you can do everything. See COPYING present in package. 
    Enjoy ;)</p>

<p>8) AUTHOR
    For more info about me you can see <a href="http://nixw0rm.users.sourceforge.net/">http://nixw0rm.users.sourceforge.net/</a></p>

        </article>
    </section>
    <script>
        (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
        })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
        ga('create', 'UA-6824126-17', 'viewdocs.io');
        ga('send', 'pageview');
    </script>
    <script src="//static.getclicky.com/js" type="text/javascript"></script>
    <script type="text/javascript">try{ clicky.init(100672863); }catch(e){}</script>
    <noscript><p><img alt="Clicky" width="1" height="1" src="//in.getclicky.com/100672863ns.gif" /></p></noscript>

</body></html>
