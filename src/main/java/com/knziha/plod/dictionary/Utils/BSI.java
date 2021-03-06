/*
 * Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.knziha.plod.dictionary.Utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BSI extends ByteArrayInputStream {
	public BSI(byte[] buf, int offset, int length) {
		super(buf, offset, Math.min(length, buf.length-offset));
	}
}
