package org.ovirt.engine.core.common.queries;

import org.ovirt.engine.core.compat.*;

public class GetAllFromExportDomainQueryParamenters extends VdcQueryParametersBase {
    private static final long serialVersionUID = 5436719744430725750L;
    private Guid privateStoragePoolId = new Guid();

    public Guid getStoragePoolId() {
        return privateStoragePoolId;
    }

    private void setStoragePoolId(Guid value) {
        privateStoragePoolId = value;
    }

    private Guid privateStorageDomainId = new Guid();

    public Guid getStorageDomainId() {
        return privateStorageDomainId;
    }

    public void setStorageDomainId(Guid value) {
        privateStorageDomainId = value;
    }

    private java.util.ArrayList<Guid> privateIds;

    public java.util.ArrayList<Guid> getIds() {
        return privateIds;
    }

    public void setIds(java.util.ArrayList<Guid> value) {
        privateIds = value;
    }

    private boolean privateGetAll;

    public boolean getGetAll() {
        return privateGetAll;
    }

    public void setGetAll(boolean value) {
        privateGetAll = value;
    }

    public GetAllFromExportDomainQueryParamenters(Guid storagePoolId, Guid storageDomainId) {
        // for getting existing Vm as well
        setGetAll(false);
        this.setStoragePoolId(storagePoolId);
        this.setStorageDomainId(storageDomainId);
    }

    public GetAllFromExportDomainQueryParamenters() {
    }
}
