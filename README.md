# Kubernetes-SpringBoot

docker build -t mertcakmak2/hello-spring .

docker push mertcakmak2/hello-spring

kubectl apply -f deployment.yaml

# Kubernetes-SpringBoot Deployment With Argo CD

kubectl create namespace argocd

kubectl apply -n argocd -f https://raw.githubusercontent.com/argoproj/argo-cd/stable/manifests/install.yaml

kubectl port-forward -n argocd svc/argocd-server 8080:443
