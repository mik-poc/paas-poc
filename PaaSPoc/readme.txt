set HTTP_PROXY=http://bluecoat-vip.bec.dk:80
set HTTPS_PROXY=https://bluecoat-vip.bec.dk:80

cf login -a https://api.run.pivotal.io -u michael.kofoed@gmail.com -o bec-poc

cf create-service elephantsql turtle paas-poc 

cf push 

cf logs paas-poc --recent