package com.zkf.xmlReader.resource;

import java.io.IOException;
import java.io.InputStream;

public interface Resource {

    InputStream getResource() throws IOException;
}
