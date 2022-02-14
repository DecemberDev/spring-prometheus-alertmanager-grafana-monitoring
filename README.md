For local environment you need to install:
```
Docker
```
And then run:
```
/bin/docker-recreate.sh 
```
And then run the application.
```
Grafana:         localhost:3000
Prometheus:      localhost:9090
AlertManager:    localhost:9093
Custom Endpoint: localhost:8080/endpoint
Custom Metric:   custom_endpoint_count_total
(showing count of usage of the custom endpoint)
```
Grafana credentials:
```
username: admin
password: admin
```
Datasource is configured (Prometheus) in:
```
/bin/datasource.yml
```
or you can configure your datasource in Grafana UI.

There is an alert that triggers if Application is down/crashed in:
```
/bin/rules.yml
```
Prometheus config is in:
```
/bin/prometheus.yml
```
If you want to make alertmanager send alerts to your email, then you need to change AlertManager config in:
```
/bin/alertmanager.yml
```
for example Gmail:
```
- to: 'enter gmail for getting alerts (for example 'receiver@gmail.com')'
  from: 'enter sender gmail (for example 'sender@gmail.com')'
  smarthost: smtp.gmail.com:587
  auth_username: 'enter sender gmail (for example 'sender@gmail.com')'
  auth_identity: 'enter sender gmail (for example 'sender@gmail.com')'
  auth_password: 'gmail sender password or gmail app password'
```
