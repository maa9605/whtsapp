package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class InputConnectionCompat {
    public static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    /* loaded from: classes.dex */
    public interface OnCommitContentListener {
        boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle);
    }

    public static boolean commitContent(InputConnection inputConnection, EditorInfo editorInfo, InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        ClipDescription description = inputContentInfoCompat.mImpl.getDescription();
        boolean z = false;
        for (String str : EditorInfoCompat.getContentMimeTypes(editorInfo)) {
            if (description.hasMimeType(str)) {
                if (Build.VERSION.SDK_INT >= 25) {
                    return inputConnection.commitContent((InputContentInfo) inputContentInfoCompat.mImpl.getInputContentInfo(), i, bundle);
                }
                int protocol = EditorInfoCompat.getProtocol(editorInfo);
                if (protocol == 2) {
                    z = true;
                } else if (protocol != 3 && protocol != 4) {
                    return false;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(z ? COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY : COMMIT_CONTENT_CONTENT_URI_KEY, inputContentInfoCompat.mImpl.getContentUri());
                bundle2.putParcelable(z ? COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY : COMMIT_CONTENT_DESCRIPTION_KEY, inputContentInfoCompat.mImpl.getDescription());
                bundle2.putParcelable(z ? COMMIT_CONTENT_LINK_URI_INTEROP_KEY : COMMIT_CONTENT_LINK_URI_KEY, inputContentInfoCompat.mImpl.getLinkUri());
                bundle2.putInt(z ? COMMIT_CONTENT_FLAGS_INTEROP_KEY : COMMIT_CONTENT_FLAGS_KEY, i);
                bundle2.putParcelable(z ? COMMIT_CONTENT_OPTS_INTEROP_KEY : COMMIT_CONTENT_OPTS_KEY, bundle);
                return inputConnection.performPrivateCommand(z ? COMMIT_CONTENT_INTEROP_ACTION : COMMIT_CONTENT_ACTION, bundle2);
            }
        }
        return false;
    }

    public static InputConnection createWrapper(InputConnection inputConnection, EditorInfo editorInfo, final OnCommitContentListener onCommitContentListener) {
        if (inputConnection != null) {
            if (editorInfo != null) {
                if (onCommitContentListener != null) {
                    if (Build.VERSION.SDK_INT >= 25) {
                        return new InputConnectionWrapper(inputConnection, false) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.1
                            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                            public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                                if (onCommitContentListener.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), i, bundle)) {
                                    return true;
                                }
                                return super.commitContent(inputContentInfo, i, bundle);
                            }
                        };
                    }
                    return EditorInfoCompat.getContentMimeTypes(editorInfo).length == 0 ? inputConnection : new InputConnectionWrapper(inputConnection, false) { // from class: androidx.core.view.inputmethod.InputConnectionCompat.2
                        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                        public boolean performPrivateCommand(String str, Bundle bundle) {
                            if (InputConnectionCompat.handlePerformPrivateCommand(str, bundle, onCommitContentListener)) {
                                return true;
                            }
                            return super.performPrivateCommand(str, bundle);
                        }
                    };
                }
                throw new IllegalArgumentException("onCommitContentListener must be non-null");
            }
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        throw new IllegalArgumentException("inputConnection must be non-null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static boolean handlePerformPrivateCommand(String str, Bundle bundle, OnCommitContentListener onCommitContentListener) {
        boolean z;
        int i = 0;
        r7 = 0;
        ?? r7 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(COMMIT_CONTENT_ACTION, str)) {
            z = false;
        } else if (!TextUtils.equals(COMMIT_CONTENT_INTEROP_ACTION, str)) {
            return false;
        } else {
            z = true;
        }
        try {
            ResultReceiver resultReceiver = (ResultReceiver) bundle.getParcelable(z ? COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY : COMMIT_CONTENT_RESULT_RECEIVER_KEY);
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY : COMMIT_CONTENT_CONTENT_URI_KEY);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY : COMMIT_CONTENT_DESCRIPTION_KEY);
                Uri uri2 = (Uri) bundle.getParcelable(z ? COMMIT_CONTENT_LINK_URI_INTEROP_KEY : COMMIT_CONTENT_LINK_URI_KEY);
                int i2 = bundle.getInt(z ? COMMIT_CONTENT_FLAGS_INTEROP_KEY : COMMIT_CONTENT_FLAGS_KEY);
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? COMMIT_CONTENT_OPTS_INTEROP_KEY : COMMIT_CONTENT_OPTS_KEY);
                if (uri != null && clipDescription != null) {
                    i = onCommitContentListener.onCommitContent(new InputContentInfoCompat(uri, clipDescription, uri2), i2, bundle2);
                    r7 = i;
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(r7, null);
                }
                return r7;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
