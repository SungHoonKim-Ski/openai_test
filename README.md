# SpringAI와 FeignClient를 사용해 ChatGPT를 연동하는 코드를 작성한 프로젝트입니다.

### application.properties에 TODO가 작성된 부분에 Api Key를 입력해야 동작합니다.
### 이후 요청의 파라미터로 질문을 넣으면 두 방식에 대해 Api를 호출할 수 있습니다.
호출 예시
- http://localhost:8080/test/feign-client?question=안녕
- http://localhost:8080/test/lib?question=안녕