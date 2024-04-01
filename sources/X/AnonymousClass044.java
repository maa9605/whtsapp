package X;

import com.facebook.msys.mci.network.common.UrlResponse;
import java.io.IOException;

/* renamed from: X.044  reason: invalid class name */
/* loaded from: classes.dex */
public interface AnonymousClass044 {
    void executeInNetworkContext(AbstractRunnableC19880wM abstractRunnableC19880wM);

    void markDataTaskAsCompletedCallback(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, IOException iOException);

    void updateDataTaskDownloadProgressCallback(String str, long j, long j2, long j3);

    void updateDataTaskUploadProgressCallback(String str, long j, long j2, long j3);
}
