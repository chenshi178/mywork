package com.work;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;

import java.util.Collections;

public class Test {

    private static RestClient restClient;


    public static void getClient() {

//        final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//
//        credentialsProvider.setCredentials(AuthScope.ANY,
//                new UsernamePasswordCredentials("elastic", "changeme"));
//
//        restClient = RestClient.builder(new HttpHost("localhost", 9200, "http"))
//                .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
//                    @Override
//                    public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
//                        return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
//                    }
//                }).build();


        restClient = RestClient.builder(new HttpHost("192.168.0.252", 9200, "http")).build();


    }


    public static void main(String[] args) {

        getClient();

        try {


            String method = "GET";
            String endpoint = "/t_pay_record/_search";
            HttpEntity entity = new NStringEntity("{\n" +
                    "  \"query\": {\n" +
                    "    \"match\": {\n" +
                    "      \"to_customer_id\": \"1699\"\n" +
                    "    }\n" +
                    "  }\n" +
                    "}", ContentType.APPLICATION_JSON);

            Response response = restClient.performRequest(method, endpoint, Collections.<String, String>emptyMap(), entity);
            System.out.println(EntityUtils.toString(response.getEntity()));
            restClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
