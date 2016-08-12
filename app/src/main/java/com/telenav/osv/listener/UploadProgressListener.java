package com.telenav.osv.listener;

import com.facebook.network.connectionclass.ConnectionClassManager;
import com.telenav.osv.item.Sequence;

/**
 * Created by Kalman on 11/18/15.
 */
public interface UploadProgressListener extends ConnectionClassManager.ConnectionClassStateChangeListener {

    void onUploadStarted(long totalSize);

    void onUploadingMetadata();

    void onPreparing(int nrOfFrames);

    void onIndexingFinished();

    void onUploadPaused();

    void onUploadResumed();

    void onUploadCancelled(int total, int remaining);

    void onUploadFinished(int successful, int unsuccessful);

    void onProgressChanged(long total, long remaining);

    void onImageUploaded(Sequence sequence, boolean success);

    void onSequenceUploaded(Sequence sequence);

    void onIndexingSequence(Sequence sequence, int remainingRecordings);
}