# Kubernetes-SpringBoot

docker build -t mertcakmak2/hello-spring .

docker push mertcakmak2/hello-spring

kubectl apply -f deployment.yaml

# Kubernetes-SpringBoot Deployment With Argo CD

kubectl create namespace argocd

kubectl apply -n argocd -f https://raw.githubusercontent.com/argoproj/argo-cd/stable/manifests/install.yaml

### **`Add NodePort to Argo Cd Service`**

kubectl patch svc argocd-server -p '{"spec": {"type": "NodePort"}}' -n argocd

kubectl get secret argocd-initial-admin-secret -n argocd -o yaml  => **password in yaml file: RmVaNUJ1V2hTcmdJeUJqbQ==**

echo RmVaNUJ1V2hTcmdJeUJqbQ== | base64 --decode => **FeZ5BuWhSrgIyBjm**

`Login Argo CD Ui with username and password => u: admin, p=FeZ5BuWhSrgIyBjm`

