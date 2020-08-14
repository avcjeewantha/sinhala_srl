=======================Instructions=======================
$$$one time$$$
1. package the project using "mvn clean package"
2. Upload the executable jar into AWS env along with TnT tool in same directory
3. Run " sudo yum install glibc.i686"
4. Open new TCP rule of the instance on port 3000

$$$Everytime Running$$$
4. Add TnT tool into path variable
	for default aws "export PATH=/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/home/ec2-user/.local/bin:/home/ec2-user/bin:/home/ec2-user/sinhalaPosTagger/tnt"
5. Run the jar file
	"java -jar pos-0.0.1-SNAPSHOT.jar"