// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpaces;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesPropertiesHciStorageProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesPropertiesStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesPropertiesVmwareStorageProfile;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class StorageSpacesOperationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"hciStorageProfile\":{\"mocGroup\":\"uneqsxvmhf\",\"mocLocation\":\"zjyi\",\"mocStorageContainer\":\"as\"},\"vmwareStorageProfile\":{\"datacenter\":\"dyp\",\"datastore\":\"yue\",\"folder\":\"lynsqyrpf\",\"resourcePool\":\"brlttymsjnygq\"},\"provisioningState\":\"Succeeded\",\"status\":{}},\"extendedLocation\":{\"type\":\"gtilax\",\"name\":\"fhqlyvi\"},\"location\":\"ouwivkxoyzunbixx\",\"tags\":{\"ivtsoxfrkenxpm\":\"kvcpwpgclr\",\"ao\":\"yefrpmpdnqqska\"},\"id\":\"vmm\",\"name\":\"npqfrtqlkzmeg\",\"type\":\"itgvkx\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        HybridContainerServiceManager manager =
            HybridContainerServiceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        StorageSpaces response =
            manager
                .storageSpacesOperations()
                .define("cporxvxcjz")
                .withRegion("zflbqvg")
                .withExistingResourceGroup("h")
                .withTags(mapOf("nwsdtutnwlduyc", "lgafcqusrdve"))
                .withProperties(
                    new StorageSpacesProperties()
                        .withHciStorageProfile(
                            new StorageSpacesPropertiesHciStorageProfile()
                                .withMocGroup("xfpxtgqscja")
                                .withMocLocation("t")
                                .withMocStorageContainer("hdqazkmtgguwp"))
                        .withVmwareStorageProfile(
                            new StorageSpacesPropertiesVmwareStorageProfile()
                                .withDatacenter("ajc")
                                .withDatastore("m")
                                .withFolder("hfcf")
                                .withResourcePool("rxgkne"))
                        .withStatus(new StorageSpacesPropertiesStatus()))
                .withExtendedLocation(new StorageSpacesExtendedLocation().withType("dfvpg").withName("oxgsgbpfgzdjtx"))
                .create();

        Assertions.assertEquals("ouwivkxoyzunbixx", response.location());
        Assertions.assertEquals("kvcpwpgclr", response.tags().get("ivtsoxfrkenxpm"));
        Assertions.assertEquals("uneqsxvmhf", response.properties().hciStorageProfile().mocGroup());
        Assertions.assertEquals("zjyi", response.properties().hciStorageProfile().mocLocation());
        Assertions.assertEquals("as", response.properties().hciStorageProfile().mocStorageContainer());
        Assertions.assertEquals("dyp", response.properties().vmwareStorageProfile().datacenter());
        Assertions.assertEquals("yue", response.properties().vmwareStorageProfile().datastore());
        Assertions.assertEquals("lynsqyrpf", response.properties().vmwareStorageProfile().folder());
        Assertions.assertEquals("brlttymsjnygq", response.properties().vmwareStorageProfile().resourcePool());
        Assertions.assertEquals("gtilax", response.extendedLocation().type());
        Assertions.assertEquals("fhqlyvi", response.extendedLocation().name());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
