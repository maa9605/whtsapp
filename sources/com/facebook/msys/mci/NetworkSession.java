package com.facebook.msys.mci;

import X.AbstractRunnableC19880wM;
import X.AnonymousClass044;
import X.C003601s;
import X.C0J0;
import X.C1YH;
import X.C43481xT;
import X.InterfaceC19860wG;
import X.InterfaceC19890wP;
import com.facebook.msys.mci.network.common.DataTask;
import com.facebook.msys.mci.network.common.DataTaskListener;
import com.facebook.msys.mci.network.common.UrlResponse;
import com.facebook.simplejni.NativeHolder;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public class NetworkSession implements AnonymousClass044 {
    public static final String TAG = "NetworkSession";
    public final HashMap mCallbackMap = new HashMap();
    public final DataTaskListener mDataTaskListener;
    public boolean mDisposed;
    public final InterfaceC19860wG mDisposer;
    public final NativeHolder mNativeHolder;
    public final NotificationCenter mNotificationCenter;

    private native void canHandleStreamingUploadUpdate(String str);

    private native NativeHolder initNativeHolder(String str, NotificationCenter notificationCenter);

    private native void markDataTaskAsCompleted(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, Throwable th);

    private native void nativeDispose();

    private native void registerDownloadTaskProgressObserver(String str);

    private native void registerUploadTaskProgressObserver(String str);

    private native void setNetworkStateConnectedNative(NotificationCenter notificationCenter);

    private native void setNetworkStateDisconnectedNative(NotificationCenter notificationCenter);

    private native void updateDataTaskDownloadProgress(String str, long j, long j2, long j3);

    private native void updateDataTaskUploadProgress(String str, long j, long j2, long j3);

    public native int getNetworkSessionTimeoutIntervalMs();

    public native DataTask[] getPendingDataTasks();

    public NetworkSession(String str, NotificationCenter notificationCenter, C0J0 c0j0) {
        C003601s.A01("NetworkSession.new");
        try {
            this.mNotificationCenter = notificationCenter;
            C43481xT c43481xT = (C43481xT) c0j0;
            this.mDataTaskListener = c43481xT.A01;
            this.mDisposer = new C1YH(c0j0);
            this.mNativeHolder = initNativeHolder(str, notificationCenter);
            int networkSessionTimeoutIntervalMs = getNetworkSessionTimeoutIntervalMs();
            if (networkSessionTimeoutIntervalMs > 0) {
                c43481xT.A00 = networkSessionTimeoutIntervalMs;
            }
        } finally {
            C003601s.A00();
        }
    }

    private void dispatchProgressUpdateToObserver(String str, long j, long j2, long j3) {
        if (this.mCallbackMap.containsKey(str)) {
            this.mCallbackMap.get(str);
        }
    }

    public synchronized void dispose() {
        if (this.mDisposed) {
            return;
        }
        InterfaceC19860wG interfaceC19860wG = this.mDisposer;
        if (interfaceC19860wG != null && ((C43481xT) ((C1YH) interfaceC19860wG).A00) == null) {
            throw null;
        }
        nativeDispose();
        this.mDisposed = true;
    }

    @Override // X.AnonymousClass044
    public void executeInNetworkContext(AbstractRunnableC19880wM abstractRunnableC19880wM) {
        Execution.executeAsyncWithPriority(abstractRunnableC19880wM, 3, 0);
    }

    @Override // X.AnonymousClass044
    public synchronized void markDataTaskAsCompletedCallback(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, IOException iOException) {
        markDataTaskAsCompleted(str, str2, i, urlResponse, bArr, str3, iOException);
        if (this.mCallbackMap.containsKey(str2)) {
            this.mCallbackMap.remove(str2);
        }
    }

    private void onNewDataTask(DataTask dataTask) {
        android.util.Log.d(TAG, "New data task received from msys");
        DataTaskListener dataTaskListener = this.mDataTaskListener;
        if (dataTaskListener != null) {
            dataTaskListener.onNewTask(dataTask, this);
        }
    }

    public synchronized void registerDownloadTaskProgressObserverCallback(String str, InterfaceC19890wP interfaceC19890wP) {
        this.mCallbackMap.put(str, interfaceC19890wP);
        registerDownloadTaskProgressObserver(str);
    }

    public synchronized void registerUploadTaskProgressObserverCallback(String str, InterfaceC19890wP interfaceC19890wP) {
        this.mCallbackMap.put(str, interfaceC19890wP);
        registerUploadTaskProgressObserver(str);
    }

    public void setNetworkStateConnected() {
        setNetworkStateConnectedNative(this.mNotificationCenter);
    }

    public void setNetworkStateDisconnected() {
        setNetworkStateDisconnectedNative(this.mNotificationCenter);
    }

    @Override // X.AnonymousClass044
    public void updateDataTaskDownloadProgressCallback(String str, long j, long j2, long j3) {
        updateDataTaskDownloadProgress(str, j, j2, j3);
    }

    @Override // X.AnonymousClass044
    public void updateDataTaskUploadProgressCallback(String str, long j, long j2, long j3) {
        updateDataTaskUploadProgress(str, j, j2, j3);
    }
}
