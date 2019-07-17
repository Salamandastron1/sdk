/***************************************************************************
 *
 * AVI CONFIDENTIAL
 * __________________
 *
 * [2013] - [2018] Avi Networks Incorporated
 * All Rights Reserved.
 *
 * NOTICE: All information contained herein is, and remains the property
 * of Avi Networks Incorporated and its suppliers, if any. The intellectual
 * and technical concepts contained herein are proprietary to Avi Networks
 * Incorporated, and its suppliers and are covered by U.S. and Foreign
 * Patents, patents in process, and are protected by trade secret or
 * copyright law, and other laws. Dissemination of this information or
 * reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from Avi Networks Incorporated.
 */

package clients

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

import (
	"github.com/avinetworks/sdk/go/models"
	"github.com/avinetworks/sdk/go/session"
)

// NetworkServiceClient is a client for avi NetworkService resource
type NetworkServiceClient struct {
	aviSession *session.AviSession
}

// NewNetworkServiceClient creates a new client for NetworkService resource
func NewNetworkServiceClient(aviSession *session.AviSession) *NetworkServiceClient {
	return &NetworkServiceClient{aviSession: aviSession}
}

func (client *NetworkServiceClient) getAPIPath(uuid string, options ...session.ApiOptionsParams) (string, error) {
	path := "api/networkservice"
	var err error
	if uuid != "" {
		path += "/" + uuid
	} else {
		path, err = session.SetApiFilter(path, options...)
		if err != nil {
			return "", err
		}
	}
	return path, nil
}

// GetAll is a collection API to get a list of NetworkService objects
func (client *NetworkServiceClient) GetAll(options ...session.ApiOptionsParams) ([]*models.NetworkService, error) {
	var plist []*models.NetworkService
	path, err := client.getAPIPath("", options...)
	if err == nil {
		err = client.aviSession.GetCollection(path, &plist, options...)
	}
	return plist, err
}

// Get an existing NetworkService by uuid
func (client *NetworkServiceClient) Get(uuid string, options ...session.ApiOptionsParams) (*models.NetworkService, error) {
	var obj *models.NetworkService
	path, _ := client.getAPIPath(uuid)
	err := client.aviSession.Get(path, &obj, options...)
	return obj, err
}

// GetByName - Get an existing NetworkService by name
func (client *NetworkServiceClient) GetByName(name string, options ...session.ApiOptionsParams) (*models.NetworkService, error) {
	var obj *models.NetworkService
	err := client.aviSession.GetObjectByName("networkservice", name, &obj, options...)
	return obj, err
}

// GetObject - Get an existing NetworkService by filters like name, cloud, tenant
// Api creates NetworkService object with every call.
func (client *NetworkServiceClient) GetObject(options ...session.ApiOptionsParams) (*models.NetworkService, error) {
	var obj *models.NetworkService
	newOptions := make([]session.ApiOptionsParams, len(options)+1)
	for i, p := range options {
		newOptions[i] = p
	}
	newOptions[len(options)] = session.SetResult(&obj)
	err := client.aviSession.GetObject("networkservice", newOptions...)
	return obj, err
}

// Create a new NetworkService object
func (client *NetworkServiceClient) Create(obj *models.NetworkService, options ...session.ApiOptionsParams) (*models.NetworkService, error) {
	var robj *models.NetworkService
	path, _ := client.getAPIPath("")
	err := client.aviSession.Post(path, obj, &robj, options...)
	return robj, err
}

// Update an existing NetworkService object
func (client *NetworkServiceClient) Update(obj *models.NetworkService, options ...session.ApiOptionsParams) (*models.NetworkService, error) {
	var robj *models.NetworkService
	path, _ := client.getAPIPath(*obj.UUID)
	err := client.aviSession.Put(path, obj, &robj, options...)
	return robj, err
}

// Patch an existing NetworkService object specified using uuid
// patchOp: Patch operation - add, replace, or delete
// patch: Patch payload should be compatible with the models.NetworkService
// or it should be json compatible of form map[string]interface{}
func (client *NetworkServiceClient) Patch(uuid string, patch interface{}, patchOp string, options ...session.ApiOptionsParams) (*models.NetworkService, error) {
	var robj *models.NetworkService
	path, _ := client.getAPIPath(uuid)
	err := client.aviSession.Patch(path, patch, patchOp, &robj, options...)
	return robj, err
}

// Delete an existing NetworkService object with a given UUID
func (client *NetworkServiceClient) Delete(uuid string, options ...session.ApiOptionsParams) error {
	path, _ := client.getAPIPath(uuid)
	if len(options) == 0 {
		return client.aviSession.Delete(path)
	} else {
		return client.aviSession.DeleteObject(path, options...)
	}
}

// DeleteByName - Delete an existing NetworkService object with a given name
func (client *NetworkServiceClient) DeleteByName(name string, options ...session.ApiOptionsParams) error {
	res, err := client.GetByName(name, options...)
	if err != nil {
		return err
	}
	return client.Delete(*res.UUID, options...)
}

// GetAviSession
func (client *NetworkServiceClient) GetAviSession() *session.AviSession {
	return client.aviSession
}