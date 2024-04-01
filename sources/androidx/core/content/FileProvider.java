package androidx.core.content;

import X.AnonymousClass027;
import X.C000200d;
import X.C02160Ac;
import X.C02470Bn;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public AnonymousClass027 A00;
    public static final String[] A03 = {"_display_name", "_size"};
    public static final File A02 = new File("/");
    public static HashMap A01 = new HashMap();

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    public static AnonymousClass027 A00(Context context, String str) {
        File file;
        C02470Bn c02470Bn;
        synchronized (A01) {
            AnonymousClass027 anonymousClass027 = (AnonymousClass027) A01.get(str);
            c02470Bn = anonymousClass027;
            if (anonymousClass027 == null) {
                try {
                    try {
                        C02470Bn c02470Bn2 = new C02470Bn(str);
                        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                        if (resolveContentProvider != null) {
                            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                            if (loadXmlMetaData != null) {
                                while (true) {
                                    int next = loadXmlMetaData.next();
                                    if (next == 1) {
                                        A01.put(str, c02470Bn2);
                                        c02470Bn = c02470Bn2;
                                        break;
                                    } else if (next == 2) {
                                        String name = loadXmlMetaData.getName();
                                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                        if ("root-path".equals(name)) {
                                            file = A02;
                                        } else if ("files-path".equals(name)) {
                                            file = context.getFilesDir();
                                        } else if ("cache-path".equals(name)) {
                                            file = context.getCacheDir();
                                        } else if ("external-path".equals(name)) {
                                            file = Environment.getExternalStorageDirectory();
                                        } else if ("external-files-path".equals(name)) {
                                            File[] A09 = C02160Ac.A09(context);
                                            if (A09.length > 0) {
                                                file = A09[0];
                                            } else {
                                                continue;
                                            }
                                        } else if ("external-cache-path".equals(name)) {
                                            File[] A08 = C02160Ac.A08(context);
                                            if (A08.length > 0) {
                                                file = A08[0];
                                            } else {
                                                continue;
                                            }
                                        } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                                            File[] externalMediaDirs = context.getExternalMediaDirs();
                                            if (externalMediaDirs.length > 0) {
                                                file = externalMediaDirs[0];
                                            } else {
                                                continue;
                                            }
                                        }
                                        if (file == null) {
                                            continue;
                                        } else {
                                            String str2 = new String[]{attributeValue2}[0];
                                            if (str2 != null) {
                                                file = new File(file, str2);
                                            }
                                            if (!TextUtils.isEmpty(attributeValue)) {
                                                try {
                                                    c02470Bn2.A01.put(attributeValue, file.getCanonicalFile());
                                                } catch (IOException e) {
                                                    StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                                                    sb.append(file);
                                                    throw new IllegalArgumentException(sb.toString(), e);
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Name must not be empty");
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                            }
                        } else {
                            throw new IllegalArgumentException(C000200d.A0H("Couldn't find meta-data for provider with authority ", str));
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return c02470Bn;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                this.A00 = A00(context, providerInfo.authority);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.A00.AAC(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File AAC = this.A00.AAC(uri);
        int lastIndexOf = AAC.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(AAC.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File AAC = this.A00.AAC(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(C000200d.A0H("Invalid mode: ", str));
            } else {
                i = 1006632960;
            }
        } else {
            i = 738197504;
        }
        return ParcelFileDescriptor.open(AAC, i);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File AAC = this.A00.AAC(uri);
        if (strArr == null) {
            strArr = A03;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = AAC.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(AAC.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
