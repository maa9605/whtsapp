package java.lang;

import X.AbstractRunnableC19880wM;
import X.AnonymousClass024;
import X.AnonymousClass029;
import X.AnonymousClass044;
import X.AnonymousClass094;
import X.C000200d;
import X.C01J;
import X.C0CD;
import X.C0IO;
import X.C25L;
import X.C2QS;
import X.C41991uq;
import X.C42881wU;
import X.C42951wb;
import X.C43481xT;
import X.C44221yi;
import X.InterfaceC43851y6;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.facebook.msys.mci.network.common.DataTask;
import com.facebook.msys.mci.network.common.NetworkUtils;
import com.facebook.msys.mci.network.common.UrlRequest;
import com.facebook.msys.mci.network.common.UrlResponse;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S0300000_I0_1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape1S0300000_I0_1(C41991uq c41991uq, C42881wU c42881wU, Location location) {
        this.A03 = 5;
        this.A02 = c41991uq;
        this.A01 = c42881wU;
        this.A00 = location;
        c42881wU.A01 = location.getLatitude();
        c42881wU.A02 = location.getLongitude();
        c42881wU.A00 = location.getAccuracy();
    }

    public RunnableEBaseShape1S0300000_I0_1(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A03) {
            case 0:
                ((C44221yi) this.A00).A04.A0B.decrementAndGet();
                ((InterfaceC43851y6) this.A01).AO3((Bitmap) this.A02);
                return;
            case 1:
                C01J c01j = ((C25L) this.A00).A1c;
                c01j.A0H.A00();
                c01j.A09.A00((C0IO) this.A01, (AnonymousClass094) this.A02);
                return;
            case 2:
                C2QS c2qs = (C2QS) this.A00;
                WamCall wamCall = (WamCall) this.A01;
                File file = (File) this.A02;
                if (wamCall == null) {
                    Log.i("app/VoipTimeSeriesLogger: injectAdditionalDataToLogs received null fieldStat, skipping injection");
                } else if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
                                Long l = wamCall.userRating;
                                long longValue = l == null ? 0L : l.longValue();
                                StringBuilder sb = new StringBuilder();
                                sb.append(";user_rating:");
                                sb.append(longValue);
                                fileOutputStream.write(sb.toString().getBytes());
                                fileOutputStream.close();
                            } catch (IOException e) {
                                Log.w("app/VoipTimeSeriesLogger: injectAdditionalDataToLogs could not inject into time series file", e);
                            }
                        }
                    }
                } else {
                    Log.w("app/VoipTimeSeriesLogger: injectAdditionalDataToLogs received bad directory path, skipping injection.");
                }
                File A0O = AnonymousClass029.A0O(c2qs.A01.A00);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(file.getName());
                sb2.append(".zip");
                File file3 = new File(A0O, sb2.toString());
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                    ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream2);
                    File[] listFiles2 = file.listFiles();
                    if (listFiles2 != null) {
                        for (File file4 : listFiles2) {
                            FileInputStream fileInputStream = new FileInputStream(file4);
                            try {
                                zipOutputStream.putNextEntry(new ZipEntry(file4.getName()));
                                AnonymousClass024.A0V(fileInputStream, zipOutputStream);
                                zipOutputStream.closeEntry();
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th2;
                                }
                            }
                        }
                    }
                    zipOutputStream.close();
                    fileOutputStream2.close();
                    c2qs.A01(file3);
                } catch (IOException e2) {
                    Log.w("app/VoipTimeSeriesLogger: could not create compressed time series file", e2);
                }
                if (AnonymousClass024.A0g(file)) {
                    return;
                }
                StringBuilder A0P = C000200d.A0P("app/VoipTimeSeriesLogger: time series data directory ");
                A0P.append(file.getAbsolutePath());
                A0P.append(" could not be deleted");
                Log.w(A0P.toString());
                return;
            case 3:
                ((VoipPhysicalCamera) this.A00).lambda$syncRunOnCameraThread$176$VoipPhysicalCamera((Exchanger) this.A01, (Callable) this.A02);
                return;
            case 4:
                C43481xT c43481xT = (C43481xT) this.A00;
                final DataTask dataTask = (DataTask) this.A01;
                final AnonymousClass044 anonymousClass044 = (AnonymousClass044) this.A02;
                int i = dataTask.mTaskType;
                if (i != 0) {
                    if (i == 1) {
                        UrlRequest urlRequest = dataTask.mUrlRequest;
                        try {
                            final File createTempFile = File.createTempFile("NetworkSessionDownload", null, c43481xT.A05);
                            FileOutputStream fileOutputStream3 = new FileOutputStream(createTempFile);
                            try {
                                final UrlResponse A00 = c43481xT.A00(dataTask.mTaskIdentifier, urlRequest, anonymousClass044, fileOutputStream3, false, true);
                                try {
                                    anonymousClass044.executeInNetworkContext(new AbstractRunnableC19880wM() { // from class: X.3uy
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super("markDataTaskCompleted");
                                        }

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            File file5;
                                            String str;
                                            DataTask dataTask2 = dataTask;
                                            String str2 = dataTask2.mTaskCategory;
                                            String str3 = dataTask2.mTaskIdentifier;
                                            int i2 = dataTask2.mTaskType;
                                            try {
                                                try {
                                                    AnonymousClass044 anonymousClass0442 = anonymousClass044;
                                                    UrlResponse urlResponse = A00;
                                                    byte[] bArr = r5;
                                                    file5 = createTempFile;
                                                    if (file5 != null) {
                                                        str = file5.getCanonicalPath();
                                                    } else {
                                                        str = null;
                                                    }
                                                    anonymousClass0442.markDataTaskAsCompletedCallback(str2, str3, i2, urlResponse, bArr, str, r7);
                                                    if (file5 == null) {
                                                        return;
                                                    }
                                                } catch (IOException e3) {
                                                    Log.e("wa-msys/NetworkSession: IOException while executing markDataTaskCompleted", e3);
                                                    anonymousClass044.markDataTaskAsCompletedCallback(str2, str3, i2, A00, r5, null, e3);
                                                    file5 = createTempFile;
                                                    if (file5 == null) {
                                                        return;
                                                    }
                                                }
                                                file5.delete();
                                            } catch (Throwable th3) {
                                                File file6 = createTempFile;
                                                if (file6 != null) {
                                                    file6.delete();
                                                }
                                                throw th3;
                                            }
                                        }
                                    });
                                    fileOutputStream3.close();
                                    return;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        } catch (IOException e3) {
                            Log.e("wa-msys/NetworkSession: IOException while executing handleDownloadDataTask", e3);
                            final UrlResponse newErrorURLResponse = NetworkUtils.newErrorURLResponse(urlRequest);
                            anonymousClass044.executeInNetworkContext(new AbstractRunnableC19880wM() { // from class: X.3uy
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super("markDataTaskCompleted");
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    File file5;
                                    String str;
                                    DataTask dataTask2 = dataTask;
                                    String str2 = dataTask2.mTaskCategory;
                                    String str3 = dataTask2.mTaskIdentifier;
                                    int i2 = dataTask2.mTaskType;
                                    try {
                                        try {
                                            AnonymousClass044 anonymousClass0442 = anonymousClass044;
                                            UrlResponse urlResponse = newErrorURLResponse;
                                            byte[] bArr = r5;
                                            file5 = createTempFile;
                                            if (file5 != null) {
                                                str = file5.getCanonicalPath();
                                            } else {
                                                str = null;
                                            }
                                            anonymousClass0442.markDataTaskAsCompletedCallback(str2, str3, i2, urlResponse, bArr, str, e3);
                                            if (file5 == null) {
                                                return;
                                            }
                                        } catch (IOException e32) {
                                            Log.e("wa-msys/NetworkSession: IOException while executing markDataTaskCompleted", e32);
                                            anonymousClass044.markDataTaskAsCompletedCallback(str2, str3, i2, newErrorURLResponse, r5, null, e32);
                                            file5 = createTempFile;
                                            if (file5 == null) {
                                                return;
                                            }
                                        }
                                        file5.delete();
                                    } catch (Throwable th32) {
                                        File file6 = createTempFile;
                                        if (file6 != null) {
                                            file6.delete();
                                        }
                                        throw th32;
                                    }
                                }
                            });
                            return;
                        }
                    } else if (i != 2 && i != 3) {
                        throw new UnsupportedOperationException(C000200d.A0K(C000200d.A0P("DataTask type "), i, " not yet supported"));
                    }
                }
                UrlRequest urlRequest2 = dataTask.mUrlRequest;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    final UrlResponse A002 = c43481xT.A00(dataTask.mTaskIdentifier, urlRequest2, anonymousClass044, byteArrayOutputStream, true, false);
                    final byte[] byteArray = byteArrayOutputStream.toByteArray();
                    anonymousClass044.executeInNetworkContext(new AbstractRunnableC19880wM() { // from class: X.3uy
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super("markDataTaskCompleted");
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            File file5;
                            String str;
                            DataTask dataTask2 = dataTask;
                            String str2 = dataTask2.mTaskCategory;
                            String str3 = dataTask2.mTaskIdentifier;
                            int i2 = dataTask2.mTaskType;
                            try {
                                try {
                                    AnonymousClass044 anonymousClass0442 = anonymousClass044;
                                    UrlResponse urlResponse = A002;
                                    byte[] bArr = byteArray;
                                    file5 = createTempFile;
                                    if (file5 != null) {
                                        str = file5.getCanonicalPath();
                                    } else {
                                        str = null;
                                    }
                                    anonymousClass0442.markDataTaskAsCompletedCallback(str2, str3, i2, urlResponse, bArr, str, e3);
                                    if (file5 == null) {
                                        return;
                                    }
                                } catch (IOException e32) {
                                    Log.e("wa-msys/NetworkSession: IOException while executing markDataTaskCompleted", e32);
                                    anonymousClass044.markDataTaskAsCompletedCallback(str2, str3, i2, A002, byteArray, null, e32);
                                    file5 = createTempFile;
                                    if (file5 == null) {
                                        return;
                                    }
                                }
                                file5.delete();
                            } catch (Throwable th32) {
                                File file6 = createTempFile;
                                if (file6 != null) {
                                    file6.delete();
                                }
                                throw th32;
                            }
                        }
                    });
                    return;
                } catch (IOException e4) {
                    Log.e("wa-msys/NetworkSession: IOException while executing handleDataDataTask", e4);
                    final UrlResponse newErrorURLResponse2 = NetworkUtils.newErrorURLResponse(urlRequest2);
                    anonymousClass044.executeInNetworkContext(new AbstractRunnableC19880wM() { // from class: X.3uy
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super("markDataTaskCompleted");
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            File file5;
                            String str;
                            DataTask dataTask2 = dataTask;
                            String str2 = dataTask2.mTaskCategory;
                            String str3 = dataTask2.mTaskIdentifier;
                            int i2 = dataTask2.mTaskType;
                            try {
                                try {
                                    AnonymousClass044 anonymousClass0442 = anonymousClass044;
                                    UrlResponse urlResponse = newErrorURLResponse2;
                                    byte[] bArr = byteArray;
                                    file5 = createTempFile;
                                    if (file5 != null) {
                                        str = file5.getCanonicalPath();
                                    } else {
                                        str = null;
                                    }
                                    anonymousClass0442.markDataTaskAsCompletedCallback(str2, str3, i2, urlResponse, bArr, str, e4);
                                    if (file5 == null) {
                                        return;
                                    }
                                } catch (IOException e32) {
                                    Log.e("wa-msys/NetworkSession: IOException while executing markDataTaskCompleted", e32);
                                    anonymousClass044.markDataTaskAsCompletedCallback(str2, str3, i2, newErrorURLResponse2, byteArray, null, e32);
                                    file5 = createTempFile;
                                    if (file5 == null) {
                                        return;
                                    }
                                }
                                file5.delete();
                            } catch (Throwable th32) {
                                File file6 = createTempFile;
                                if (file6 != null) {
                                    file6.delete();
                                }
                                throw th32;
                            }
                        }
                    });
                    return;
                }
            case 5:
                C41991uq c41991uq = (C41991uq) this.A02;
                try {
                    List<Address> fromLocation = new Geocoder(c41991uq.A0G.A00, c41991uq.A0I.A0I()).getFromLocation(((Location) this.A00).getLatitude(), ((Location) this.A00).getLongitude(), 1);
                    if (fromLocation != null && !fromLocation.isEmpty()) {
                        ((C42881wU) this.A01).A09 = fromLocation.get(0).getLocality();
                    }
                } catch (Exception unused2) {
                }
                C42951wb c42951wb = c41991uq.A0N;
                C42881wU c42881wU = (C42881wU) this.A01;
                String str = c42881wU.A0F;
                double d = c42881wU.A01;
                double d2 = c42881wU.A02;
                double d3 = c42881wU.A00;
                String str2 = c42881wU.A09;
                if (c42951wb != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("lat", Double.valueOf(d));
                    contentValues.put("lon", Double.valueOf(d2));
                    contentValues.put("accuracy", Double.valueOf(d3));
                    contentValues.put("place_name", str2);
                    C0CD c0cd = new C0CD(null, c42951wb.A02, true);
                    try {
                        c0cd.A02.A00("sessions", contentValues, "browser_id = ?", new String[]{str});
                        c0cd.close();
                        c41991uq.A09.post(new RunnableEBaseShape9S0100000_I1_1(c41991uq, 32));
                        return;
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            try {
                                c0cd.close();
                            } catch (Throwable unused3) {
                            }
                            throw th6;
                        }
                    }
                }
                throw null;
            default:
                return;
        }
    }
}
