==========================Instructions======================
$$$One Time$$$
1. Install java jdk 1.8
2. Install python3	"sudo yum install -y python3"
3. Create virtual envirenment	"python3 -m venv myenv"
4. Activate venv	"source venv/bin/activate"
5. Install flask	"pip install flask"
5. Install nltk	"pip install nltk"
6. Install Sinlin project dependencies
7. Create Apache reverse proxy (path to create .conf file /etc/httpd/conf.d/<name>.conf)

	<VirtualHost *:80>
        	ProxyPreserveHost on
        	ProxyPass /splitt http://127.0.0.1:5000/split
        	ProxyPassReverse /splitt http://127.0.0.1:5000/split
	</VirtualHost>
8. If apache web server is not installed, install it before creating reverce proxy. "sudo yum install httpd"
9. Restart apache server "sudo systemctl restart httpd"
10. Open port 80 in instance inbound rules

$$$Every time running$$$
1. Add sinling into pythonpath "export PYTHONPATH=/home/ec2-user/semantic/Additioinal\ Tools/sinhalaWordsplitter/sinling"
2. Activate venv	"source venv/bin/activate"
3. Run the app		"python -m flask run"