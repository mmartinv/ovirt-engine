package org.ovirt.engine.core.common.asynctasks;

public enum AsyncTaskType {
    unknown,
    copyImage,
    moveImage,
    createVolume,
    deleteVolume,
    deleteImage,
    mergeSnapshots,
    cloneImageStructure,
    syncImageData,
    extendImageSize,
    downloadImage,
    uploadImageFromStream,
    downloadImageFromStream,
    notSupported;

    public int getValue() {
        return this.ordinal();
    }

    public static AsyncTaskType forValue(int value) {
        return values()[value];
    }
}
