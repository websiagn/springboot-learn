package com.example.springbootlearn.config;

//@Configuration
//public class JacksonConfig {
//    @Bean
//    @Primary
//    @ConditionalOnMissingBean(ObjectMapper.class)
//    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder){
//        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
//        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
//            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
//                jsonGenerator.writeString("");
//            }
//        });
//        return objectMapper;
//    }
//}
