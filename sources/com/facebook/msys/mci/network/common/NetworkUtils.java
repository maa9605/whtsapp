package com.facebook.msys.mci.network.common;

import X.AbstractRunnableC19880wM;
import X.AnonymousClass044;
import android.util.Pair;
import com.facebook.msys.mci.network.common.DataTask;
import com.facebook.msys.mci.network.common.UrlResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;

/* loaded from: classes.dex */
public class NetworkUtils {
    public static native String getSandboxDomain();

    public static native synchronized void setSandboxDomain(String str);

    public static Map flattenHeaders(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    hashMap.put(entry.getKey(), ((List) entry.getValue()).get(0));
                } else if (list.size() > 1) {
                    StringBuilder sb = new StringBuilder(list.size() << 4);
                    for (int i = 1; i < list.size(); i++) {
                        sb.append(',');
                        sb.append((String) list.get(i));
                    }
                    hashMap.put(entry.getKey(), sb.toString());
                }
            }
        }
        return hashMap;
    }

    public static Map flattenHeaders(Header[] headerArr) {
        HashMap hashMap = new HashMap();
        for (Header header : headerArr) {
            hashMap.put(header.getName(), header.getValue());
        }
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair httpHeaderMapToKeysAndValues(Map map) {
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        return new Pair(strArr, strArr2);
    }

    public static void markDataTaskCompleted(final DataTask dataTask, final AnonymousClass044 anonymousClass044, final UrlResponse urlResponse, String str, final byte[] bArr, final File file, final IOException iOException) {
        anonymousClass044.executeInNetworkContext(new AbstractRunnableC19880wM() { // from class: X.1YK
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("markDataTaskCompleted");
            }

            @Override // java.lang.Runnable
            public void run() {
                File file2;
                String str2;
                DataTask dataTask2 = DataTask.this;
                String str3 = dataTask2.mTaskCategory;
                String str4 = dataTask2.mTaskIdentifier;
                int i = dataTask2.mTaskType;
                try {
                    try {
                        AnonymousClass044 anonymousClass0442 = anonymousClass044;
                        UrlResponse urlResponse2 = urlResponse;
                        byte[] bArr2 = bArr;
                        file2 = file;
                        if (file2 != null) {
                            str2 = file2.getCanonicalPath();
                        } else {
                            str2 = null;
                        }
                        anonymousClass0442.markDataTaskAsCompletedCallback(str3, str4, i, urlResponse2, bArr2, str2, iOException);
                        if (file2 == null) {
                            return;
                        }
                    } catch (IOException e) {
                        anonymousClass044.markDataTaskAsCompletedCallback(str3, str4, i, urlResponse, bArr, null, e);
                        file2 = file;
                        if (file2 == null) {
                            return;
                        }
                    }
                    file2.delete();
                } catch (Throwable th) {
                    File file3 = file;
                    if (file3 != null) {
                        file3.delete();
                    }
                    throw th;
                }
            }
        });
    }

    public static UrlResponse newErrorURLResponse(UrlRequest urlRequest) {
        return new UrlResponse(urlRequest, 0, new HashMap());
    }
}
