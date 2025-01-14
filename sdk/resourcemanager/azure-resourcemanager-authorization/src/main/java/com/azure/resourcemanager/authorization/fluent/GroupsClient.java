// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.GroupsOrderby;
import com.azure.resourcemanager.authorization.fluent.models.GroupsSelect;
import com.azure.resourcemanager.authorization.fluent.models.MicrosoftGraphDirectoryObjectInner;
import java.util.List;
import java.util.Map;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GroupsClient. */
public interface GroupsClient {
    /**
     * Get acceptedSenders from groups.
     *
     * @param groupId key: id of group.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return acceptedSenders from groups as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphDirectoryObjectInner> listAcceptedSendersAsync(
        String groupId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<GroupsOrderby> orderby,
        List<GroupsSelect> select,
        List<String> expand);

    /**
     * Get acceptedSenders from groups.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return acceptedSenders from groups as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphDirectoryObjectInner> listAcceptedSendersAsync(String groupId);

    /**
     * Get acceptedSenders from groups.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return acceptedSenders from groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphDirectoryObjectInner> listAcceptedSenders(String groupId);

    /**
     * Get acceptedSenders from groups.
     *
     * @param groupId key: id of group.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return acceptedSenders from groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphDirectoryObjectInner> listAcceptedSenders(
        String groupId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<GroupsOrderby> orderby,
        List<GroupsSelect> select,
        List<String> expand,
        Context context);

    /**
     * Create new navigation property to acceptedSenders for groups.
     *
     * @param groupId key: id of group.
     * @param body New navigation property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return directoryObject along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<MicrosoftGraphDirectoryObjectInner>> createAcceptedSendersWithResponseAsync(
        String groupId, MicrosoftGraphDirectoryObjectInner body);

    /**
     * Create new navigation property to acceptedSenders for groups.
     *
     * @param groupId key: id of group.
     * @param body New navigation property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return directoryObject on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<MicrosoftGraphDirectoryObjectInner> createAcceptedSendersAsync(
        String groupId, MicrosoftGraphDirectoryObjectInner body);

    /**
     * Create new navigation property to acceptedSenders for groups.
     *
     * @param groupId key: id of group.
     * @param body New navigation property.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return directoryObject.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MicrosoftGraphDirectoryObjectInner createAcceptedSenders(String groupId, MicrosoftGraphDirectoryObjectInner body);

    /**
     * Create new navigation property to acceptedSenders for groups.
     *
     * @param groupId key: id of group.
     * @param body New navigation property.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return directoryObject along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MicrosoftGraphDirectoryObjectInner> createAcceptedSendersWithResponse(
        String groupId, MicrosoftGraphDirectoryObjectInner body, Context context);

    /**
     * Get members from groups.
     *
     * @param groupId key: id of group.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return members from groups as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphDirectoryObjectInner> listMembersAsync(
        String groupId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<GroupsOrderby> orderby,
        List<GroupsSelect> select,
        List<String> expand);

    /**
     * Get members from groups.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return members from groups as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<MicrosoftGraphDirectoryObjectInner> listMembersAsync(String groupId);

    /**
     * Get members from groups.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return members from groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphDirectoryObjectInner> listMembers(String groupId);

    /**
     * Get members from groups.
     *
     * @param groupId key: id of group.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param select Select properties to be returned.
     * @param expand Expand related entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return members from groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MicrosoftGraphDirectoryObjectInner> listMembers(
        String groupId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<GroupsOrderby> orderby,
        List<GroupsSelect> select,
        List<String> expand,
        Context context);

    /**
     * Get ref of members from groups.
     *
     * @param groupId key: id of group.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ref of members from groups as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<String> listRefMembersAsync(
        String groupId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<GroupsOrderby> orderby);

    /**
     * Get ref of members from groups.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ref of members from groups as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<String> listRefMembersAsync(String groupId);

    /**
     * Get ref of members from groups.
     *
     * @param groupId key: id of group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ref of members from groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<String> listRefMembers(String groupId);

    /**
     * Get ref of members from groups.
     *
     * @param groupId key: id of group.
     * @param top Show only the first n items.
     * @param skip Skip the first n items.
     * @param search Search items by search phrases.
     * @param filter Filter items by property values.
     * @param count Include count of items.
     * @param orderby Order items by property values.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ref of members from groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<String> listRefMembers(
        String groupId,
        Integer top,
        Integer skip,
        String search,
        String filter,
        Boolean count,
        List<GroupsOrderby> orderby,
        Context context);

    /**
     * Create new navigation property ref to members for groups.
     *
     * @param groupId key: id of group.
     * @param body New navigation property ref value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> createRefMembersWithResponseAsync(String groupId, Map<String, Object> body);

    /**
     * Create new navigation property ref to members for groups.
     *
     * @param groupId key: id of group.
     * @param body New navigation property ref value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> createRefMembersAsync(String groupId, Map<String, Object> body);

    /**
     * Create new navigation property ref to members for groups.
     *
     * @param groupId key: id of group.
     * @param body New navigation property ref value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void createRefMembers(String groupId, Map<String, Object> body);

    /**
     * Create new navigation property ref to members for groups.
     *
     * @param groupId key: id of group.
     * @param body New navigation property ref value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> createRefMembersWithResponse(String groupId, Map<String, Object> body, Context context);

    /**
     * Delete ref of member from groups.
     *
     * @param groupId key: id of group.
     * @param directoryObjectId key: directoryObject-id.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteRefMemberWithResponseAsync(String groupId, String directoryObjectId, String ifMatch);

    /**
     * Delete ref of member from groups.
     *
     * @param groupId key: id of group.
     * @param directoryObjectId key: directoryObject-id.
     * @param ifMatch ETag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteRefMemberAsync(String groupId, String directoryObjectId, String ifMatch);

    /**
     * Delete ref of member from groups.
     *
     * @param groupId key: id of group.
     * @param directoryObjectId key: directoryObject-id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteRefMemberAsync(String groupId, String directoryObjectId);

    /**
     * Delete ref of member from groups.
     *
     * @param groupId key: id of group.
     * @param directoryObjectId key: directoryObject-id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteRefMember(String groupId, String directoryObjectId);

    /**
     * Delete ref of member from groups.
     *
     * @param groupId key: id of group.
     * @param directoryObjectId key: directoryObject-id.
     * @param ifMatch ETag.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.authorization.fluent.models.OdataErrorMainException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteRefMemberWithResponse(
        String groupId, String directoryObjectId, String ifMatch, Context context);
}
