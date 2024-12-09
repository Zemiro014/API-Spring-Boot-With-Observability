# API-Spring-Boot-With-Observability

## Para executar a aplicação com opentelemetry-javaagent , use o seguinte comando:
```sh
java -javaagent:opentelemetry/opentelemetry-javaagent.jar -Dotel.service.name=service_with_observability-api -Dotel.traces.exporter=otlp -Dotel.metrics.exporter=none -Dotel.logs.exporter=none -Dotel.exporter.otlp.endpoint=http://172.17.0.1:4318 -Dotel.exporter.otlp.protocol=http/protobuf -jar target/*.jar
