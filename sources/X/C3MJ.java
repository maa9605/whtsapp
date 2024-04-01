package X;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.JsonReader;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.3MJ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3MJ implements Closeable {
    public C3MI A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final ParcelFileDescriptor A04;
    public final JsonReader A05;

    public C3MJ(JsonReader jsonReader, ParcelFileDescriptor parcelFileDescriptor) {
        this.A05 = jsonReader;
        this.A04 = parcelFileDescriptor;
    }

    public boolean A00() {
        C3MI c3mi;
        if (!this.A01) {
            if (this.A00 != null) {
                return true;
            }
            if (this.A02) {
                return false;
            }
            if (!this.A03) {
                JsonReader jsonReader = this.A05;
                jsonReader.beginObject();
                while (true) {
                    if (!jsonReader.hasNext()) {
                        break;
                    } else if ("files".equals(jsonReader.nextName())) {
                        jsonReader.beginArray();
                        this.A03 = true;
                        break;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (!this.A03) {
                    this.A02 = true;
                    return false;
                }
            }
            do {
                JsonReader jsonReader2 = this.A05;
                if (!jsonReader2.hasNext()) {
                    this.A02 = true;
                    return false;
                }
                jsonReader2.beginObject();
                c3mi = null;
                long j = -1;
                String str = null;
                while (jsonReader2.hasNext()) {
                    String nextName = jsonReader2.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode == 3433509) {
                        if (nextName.equals("path")) {
                            str = jsonReader2.nextString();
                        } else {
                            Log.e("GoogleMigrateFileData/parseFileDataObject/field not recognized");
                            jsonReader2.skipValue();
                        }
                    } else {
                        if (hashCode == 3530753 && nextName.equals("size")) {
                            j = jsonReader2.nextLong();
                        }
                        Log.e("GoogleMigrateFileData/parseFileDataObject/field not recognized");
                        jsonReader2.skipValue();
                    }
                }
                jsonReader2.endObject();
                if (!TextUtils.isEmpty(str)) {
                    c3mi = new C3MI(str, j);
                } else {
                    Log.e("GoogleMigrateFileData/parseFileDataObject/file path is null or empty");
                }
                this.A00 = c3mi;
            } while (c3mi == null);
            return true;
        }
        throw new IOException("Closed.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01 = true;
        this.A05.close();
        this.A04.close();
    }
}
