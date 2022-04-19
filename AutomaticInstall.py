import subprocess
import json
def install(name):
    v=subprocess.call(['pip3','install',name])
    if v==1:
        print(name+' ' +'install failed')

f=open('dataf.json')
data=json.load(f)
for i in data['Dependencies']:
    install(i)
f.close()
