Project Path: chatbot

Source Tree:

```txt
chatbot
├── HELP.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── br
│   │   │       └── com
│   │   │           └── TrabalhoEngSoftwareFramework
│   │   │               └── framework
│   │   │                   ├── ChatbotApplication.java
│   │   │                   ├── controller
│   │   │                   │   ├── AiController.java
│   │   │                   │   ├── AuthenticationController.java
│   │   │                   │   ├── DeckController.java
│   │   │                   │   ├── FlashcardController.java
│   │   │                   │   ├── NoteController.java
│   │   │                   │   ├── SourceController.java
│   │   │                   │   ├── TopicController.java
│   │   │                   │   └── UserController.java
│   │   │                   ├── dto
│   │   │                   │   ├── AuthenticationDTO.java
│   │   │                   │   ├── DeckDTO.java
│   │   │                   │   ├── DeckSummaryDTO.java
│   │   │                   │   ├── FlashcardDTO.java
│   │   │                   │   ├── NoteDTO.java
│   │   │                   │   ├── NoteSummaryDTO.java
│   │   │                   │   ├── NoteUpdateDTO.java
│   │   │                   │   ├── RegisterDTO.java
│   │   │                   │   ├── SourceDTO.java
│   │   │                   │   ├── TokenDTO.java
│   │   │                   │   ├── UpdatePasswordDTO.java
│   │   │                   │   ├── UserAnswerDTO.java
│   │   │                   │   └── UserDTO.java
│   │   │                   ├── entity
│   │   │                   │   ├── DeckEntity.java
│   │   │                   │   ├── FlashcardEntity.java
│   │   │                   │   ├── NoteEntity.java
│   │   │                   │   ├── SourceEntity.java
│   │   │                   │   └── UserEntity.java
│   │   │                   ├── exception
│   │   │                   │   ├── AuthenticationFailureException.java
│   │   │                   │   ├── FileStorageException.java
│   │   │                   │   ├── GlobalExceptionHandler.java
│   │   │                   │   ├── IncorrectPasswordException.java
│   │   │                   │   ├── InvalidObjectDataException.java
│   │   │                   │   ├── ObjectDeletionException.java
│   │   │                   │   ├── ObjectNotFoundException.java
│   │   │                   │   ├── PasswordMismatchException.java
│   │   │                   │   ├── StorageInitializationException.java
│   │   │                   │   ├── UnauthorizedObjectAccessException.java
│   │   │                   │   ├── UnexpectedFailureException.java
│   │   │                   │   └── UnexpectedResponseException.java
│   │   │                   ├── handler
│   │   │                   │   ├── FlashcardTypeHandler.java
│   │   │                   │   ├── FlashcardTypeHandlerRegistry.java
│   │   │                   │   ├── FlashcardTypeSearchHandler.java
│   │   │                   │   └── FlashcardTypeSearchRegistry.java
│   │   │                   ├── infra
│   │   │                   │   ├── provider
│   │   │                   │   │   └── AiProviderConfig.java
│   │   │                   │   └── security
│   │   │                   │       ├── CorsConfig.java
│   │   │                   │       ├── SecurityConfiguration.java
│   │   │                   │       ├── SecurityFilter.java
│   │   │                   │       └── TokenService.java
│   │   │                   ├── repository
│   │   │                   │   ├── DeckRepository.java
│   │   │                   │   ├── FlashcardRepository.java
│   │   │                   │   ├── NoteRepository.java
│   │   │                   │   ├── SourceRepository.java
│   │   │                   │   └── UserRepository.java
│   │   │                   ├── service
│   │   │                   │   ├── AiService.java
│   │   │                   │   ├── AuthorizationService.java
│   │   │                   │   ├── DeckService.java
│   │   │                   │   ├── FlashcardService.java
│   │   │                   │   ├── NoteService.java
│   │   │                   │   ├── SourceService.java
│   │   │                   │   ├── TopicService.java
│   │   │                   │   ├── UserService.java
│   │   │                   │   ├── prompt
│   │   │                   │   │   └── PromptBuilder.java
│   │   │                   │   └── provider
│   │   │                   │       └── AiProvider.java
│   │   │                   └── specification
│   │   │                       ├── DeckSpecificationBuilder.java
│   │   │                       ├── FlashcardSpecificationBuilder.java
│   │   │                       ├── NoteSpecificationBuilder.java
│   │   │                       └── SpecificationBuilder.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       ├── java
│       │   └── br
│       │       └── com
│       │           └── TrabalhoEngSoftwareFramework
│       │               └── framework
│       │                   └── ChatbotApplicationTests.java
│       └── resource
│           └── application.properties
└── uploads

```

`chatbot/HELP.md`:

```md
   1 | # Getting Started
   2 | 
   3 | ### Reference Documentation
   4 | For further reference, please consider the following sections:
   5 | 
   6 | * [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
   7 | * [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.4/maven-plugin)
   8 | * [Create an OCI image](https://docs.spring.io/spring-boot/3.4.4/maven-plugin/build-image.html)
   9 | * [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.4/reference/using/devtools.html)
  10 | * [Spring Web](https://docs.spring.io/spring-boot/3.4.4/reference/web/servlet.html)
  11 | * [Spring Data JPA](https://docs.spring.io/spring-boot/3.4.4/reference/data/sql.html#data.sql.jpa-and-spring-data)
  12 | 
  13 | ### Guides
  14 | The following guides illustrate how to use some features concretely:
  15 | 
  16 | * [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
  17 | * [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
  18 | * [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
  19 | * [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
  20 | 
  21 | ### Maven Parent overrides
  22 | 
  23 | Due to Maven's design, elements are inherited from the parent POM to the project POM.
  24 | While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
  25 | To prevent this, the project POM contains empty overrides for these elements.
  26 | If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.
  27 | 

```

`chatbot/mvnw`:

```
   1 | #!/bin/sh
   2 | # ----------------------------------------------------------------------------
   3 | # Licensed to the Apache Software Foundation (ASF) under one
   4 | # or more contributor license agreements.  See the NOTICE file
   5 | # distributed with this work for additional information
   6 | # regarding copyright ownership.  The ASF licenses this file
   7 | # to you under the Apache License, Version 2.0 (the
   8 | # "License"); you may not use this file except in compliance
   9 | # with the License.  You may obtain a copy of the License at
  10 | #
  11 | #    http://www.apache.org/licenses/LICENSE-2.0
  12 | #
  13 | # Unless required by applicable law or agreed to in writing,
  14 | # software distributed under the License is distributed on an
  15 | # "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  16 | # KIND, either express or implied.  See the License for the
  17 | # specific language governing permissions and limitations
  18 | # under the License.
  19 | # ----------------------------------------------------------------------------
  20 | 
  21 | # ----------------------------------------------------------------------------
  22 | # Apache Maven Wrapper startup batch script, version 3.3.2
  23 | #
  24 | # Optional ENV vars
  25 | # -----------------
  26 | #   JAVA_HOME - location of a JDK home dir, required when download maven via java source
  27 | #   MVNW_REPOURL - repo url base for downloading maven distribution
  28 | #   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
  29 | #   MVNW_VERBOSE - true: enable verbose log; debug: trace the mvnw script; others: silence the output
  30 | # ----------------------------------------------------------------------------
  31 | 
  32 | set -euf
  33 | [ "${MVNW_VERBOSE-}" != debug ] || set -x
  34 | 
  35 | # OS specific support.
  36 | native_path() { printf %s\\n "$1"; }
  37 | case "$(uname)" in
  38 | CYGWIN* | MINGW*)
  39 |   [ -z "${JAVA_HOME-}" ] || JAVA_HOME="$(cygpath --unix "$JAVA_HOME")"
  40 |   native_path() { cygpath --path --windows "$1"; }
  41 |   ;;
  42 | esac
  43 | 
  44 | # set JAVACMD and JAVACCMD
  45 | set_java_home() {
  46 |   # For Cygwin and MinGW, ensure paths are in Unix format before anything is touched
  47 |   if [ -n "${JAVA_HOME-}" ]; then
  48 |     if [ -x "$JAVA_HOME/jre/sh/java" ]; then
  49 |       # IBM's JDK on AIX uses strange locations for the executables
  50 |       JAVACMD="$JAVA_HOME/jre/sh/java"
  51 |       JAVACCMD="$JAVA_HOME/jre/sh/javac"
  52 |     else
  53 |       JAVACMD="$JAVA_HOME/bin/java"
  54 |       JAVACCMD="$JAVA_HOME/bin/javac"
  55 | 
  56 |       if [ ! -x "$JAVACMD" ] || [ ! -x "$JAVACCMD" ]; then
  57 |         echo "The JAVA_HOME environment variable is not defined correctly, so mvnw cannot run." >&2
  58 |         echo "JAVA_HOME is set to \"$JAVA_HOME\", but \"\$JAVA_HOME/bin/java\" or \"\$JAVA_HOME/bin/javac\" does not exist." >&2
  59 |         return 1
  60 |       fi
  61 |     fi
  62 |   else
  63 |     JAVACMD="$(
  64 |       'set' +e
  65 |       'unset' -f command 2>/dev/null
  66 |       'command' -v java
  67 |     )" || :
  68 |     JAVACCMD="$(
  69 |       'set' +e
  70 |       'unset' -f command 2>/dev/null
  71 |       'command' -v javac
  72 |     )" || :
  73 | 
  74 |     if [ ! -x "${JAVACMD-}" ] || [ ! -x "${JAVACCMD-}" ]; then
  75 |       echo "The java/javac command does not exist in PATH nor is JAVA_HOME set, so mvnw cannot run." >&2
  76 |       return 1
  77 |     fi
  78 |   fi
  79 | }
  80 | 
  81 | # hash string like Java String::hashCode
  82 | hash_string() {
  83 |   str="${1:-}" h=0
  84 |   while [ -n "$str" ]; do
  85 |     char="${str%"${str#?}"}"
  86 |     h=$(((h * 31 + $(LC_CTYPE=C printf %d "'$char")) % 4294967296))
  87 |     str="${str#?}"
  88 |   done
  89 |   printf %x\\n $h
  90 | }
  91 | 
  92 | verbose() { :; }
  93 | [ "${MVNW_VERBOSE-}" != true ] || verbose() { printf %s\\n "${1-}"; }
  94 | 
  95 | die() {
  96 |   printf %s\\n "$1" >&2
  97 |   exit 1
  98 | }
  99 | 
 100 | trim() {
 101 |   # MWRAPPER-139:
 102 |   #   Trims trailing and leading whitespace, carriage returns, tabs, and linefeeds.
 103 |   #   Needed for removing poorly interpreted newline sequences when running in more
 104 |   #   exotic environments such as mingw bash on Windows.
 105 |   printf "%s" "${1}" | tr -d '[:space:]'
 106 | }
 107 | 
 108 | # parse distributionUrl and optional distributionSha256Sum, requires .mvn/wrapper/maven-wrapper.properties
 109 | while IFS="=" read -r key value; do
 110 |   case "${key-}" in
 111 |   distributionUrl) distributionUrl=$(trim "${value-}") ;;
 112 |   distributionSha256Sum) distributionSha256Sum=$(trim "${value-}") ;;
 113 |   esac
 114 | done <"${0%/*}/.mvn/wrapper/maven-wrapper.properties"
 115 | [ -n "${distributionUrl-}" ] || die "cannot read distributionUrl property in ${0%/*}/.mvn/wrapper/maven-wrapper.properties"
 116 | 
 117 | case "${distributionUrl##*/}" in
 118 | maven-mvnd-*bin.*)
 119 |   MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/
 120 |   case "${PROCESSOR_ARCHITECTURE-}${PROCESSOR_ARCHITEW6432-}:$(uname -a)" in
 121 |   *AMD64:CYGWIN* | *AMD64:MINGW*) distributionPlatform=windows-amd64 ;;
 122 |   :Darwin*x86_64) distributionPlatform=darwin-amd64 ;;
 123 |   :Darwin*arm64) distributionPlatform=darwin-aarch64 ;;
 124 |   :Linux*x86_64*) distributionPlatform=linux-amd64 ;;
 125 |   *)
 126 |     echo "Cannot detect native platform for mvnd on $(uname)-$(uname -m), use pure java version" >&2
 127 |     distributionPlatform=linux-amd64
 128 |     ;;
 129 |   esac
 130 |   distributionUrl="${distributionUrl%-bin.*}-$distributionPlatform.zip"
 131 |   ;;
 132 | maven-mvnd-*) MVN_CMD=mvnd.sh _MVNW_REPO_PATTERN=/maven/mvnd/ ;;
 133 | *) MVN_CMD="mvn${0##*/mvnw}" _MVNW_REPO_PATTERN=/org/apache/maven/ ;;
 134 | esac
 135 | 
 136 | # apply MVNW_REPOURL and calculate MAVEN_HOME
 137 | # maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
 138 | [ -z "${MVNW_REPOURL-}" ] || distributionUrl="$MVNW_REPOURL$_MVNW_REPO_PATTERN${distributionUrl#*"$_MVNW_REPO_PATTERN"}"
 139 | distributionUrlName="${distributionUrl##*/}"
 140 | distributionUrlNameMain="${distributionUrlName%.*}"
 141 | distributionUrlNameMain="${distributionUrlNameMain%-bin}"
 142 | MAVEN_USER_HOME="${MAVEN_USER_HOME:-${HOME}/.m2}"
 143 | MAVEN_HOME="${MAVEN_USER_HOME}/wrapper/dists/${distributionUrlNameMain-}/$(hash_string "$distributionUrl")"
 144 | 
 145 | exec_maven() {
 146 |   unset MVNW_VERBOSE MVNW_USERNAME MVNW_PASSWORD MVNW_REPOURL || :
 147 |   exec "$MAVEN_HOME/bin/$MVN_CMD" "$@" || die "cannot exec $MAVEN_HOME/bin/$MVN_CMD"
 148 | }
 149 | 
 150 | if [ -d "$MAVEN_HOME" ]; then
 151 |   verbose "found existing MAVEN_HOME at $MAVEN_HOME"
 152 |   exec_maven "$@"
 153 | fi
 154 | 
 155 | case "${distributionUrl-}" in
 156 | *?-bin.zip | *?maven-mvnd-?*-?*.zip) ;;
 157 | *) die "distributionUrl is not valid, must match *-bin.zip or maven-mvnd-*.zip, but found '${distributionUrl-}'" ;;
 158 | esac
 159 | 
 160 | # prepare tmp dir
 161 | if TMP_DOWNLOAD_DIR="$(mktemp -d)" && [ -d "$TMP_DOWNLOAD_DIR" ]; then
 162 |   clean() { rm -rf -- "$TMP_DOWNLOAD_DIR"; }
 163 |   trap clean HUP INT TERM EXIT
 164 | else
 165 |   die "cannot create temp dir"
 166 | fi
 167 | 
 168 | mkdir -p -- "${MAVEN_HOME%/*}"
 169 | 
 170 | # Download and Install Apache Maven
 171 | verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
 172 | verbose "Downloading from: $distributionUrl"
 173 | verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"
 174 | 
 175 | # select .zip or .tar.gz
 176 | if ! command -v unzip >/dev/null; then
 177 |   distributionUrl="${distributionUrl%.zip}.tar.gz"
 178 |   distributionUrlName="${distributionUrl##*/}"
 179 | fi
 180 | 
 181 | # verbose opt
 182 | __MVNW_QUIET_WGET=--quiet __MVNW_QUIET_CURL=--silent __MVNW_QUIET_UNZIP=-q __MVNW_QUIET_TAR=''
 183 | [ "${MVNW_VERBOSE-}" != true ] || __MVNW_QUIET_WGET='' __MVNW_QUIET_CURL='' __MVNW_QUIET_UNZIP='' __MVNW_QUIET_TAR=v
 184 | 
 185 | # normalize http auth
 186 | case "${MVNW_PASSWORD:+has-password}" in
 187 | '') MVNW_USERNAME='' MVNW_PASSWORD='' ;;
 188 | has-password) [ -n "${MVNW_USERNAME-}" ] || MVNW_USERNAME='' MVNW_PASSWORD='' ;;
 189 | esac
 190 | 
 191 | if [ -z "${MVNW_USERNAME-}" ] && command -v wget >/dev/null; then
 192 |   verbose "Found wget ... using wget"
 193 |   wget ${__MVNW_QUIET_WGET:+"$__MVNW_QUIET_WGET"} "$distributionUrl" -O "$TMP_DOWNLOAD_DIR/$distributionUrlName" || die "wget: Failed to fetch $distributionUrl"
 194 | elif [ -z "${MVNW_USERNAME-}" ] && command -v curl >/dev/null; then
 195 |   verbose "Found curl ... using curl"
 196 |   curl ${__MVNW_QUIET_CURL:+"$__MVNW_QUIET_CURL"} -f -L -o "$TMP_DOWNLOAD_DIR/$distributionUrlName" "$distributionUrl" || die "curl: Failed to fetch $distributionUrl"
 197 | elif set_java_home; then
 198 |   verbose "Falling back to use Java to download"
 199 |   javaSource="$TMP_DOWNLOAD_DIR/Downloader.java"
 200 |   targetZip="$TMP_DOWNLOAD_DIR/$distributionUrlName"
 201 |   cat >"$javaSource" <<-END
 202 | 	public class Downloader extends java.net.Authenticator
 203 | 	{
 204 | 	  protected java.net.PasswordAuthentication getPasswordAuthentication()
 205 | 	  {
 206 | 	    return new java.net.PasswordAuthentication( System.getenv( "MVNW_USERNAME" ), System.getenv( "MVNW_PASSWORD" ).toCharArray() );
 207 | 	  }
 208 | 	  public static void main( String[] args ) throws Exception
 209 | 	  {
 210 | 	    setDefault( new Downloader() );
 211 | 	    java.nio.file.Files.copy( java.net.URI.create( args[0] ).toURL().openStream(), java.nio.file.Paths.get( args[1] ).toAbsolutePath().normalize() );
 212 | 	  }
 213 | 	}
 214 | 	END
 215 |   # For Cygwin/MinGW, switch paths to Windows format before running javac and java
 216 |   verbose " - Compiling Downloader.java ..."
 217 |   "$(native_path "$JAVACCMD")" "$(native_path "$javaSource")" || die "Failed to compile Downloader.java"
 218 |   verbose " - Running Downloader.java ..."
 219 |   "$(native_path "$JAVACMD")" -cp "$(native_path "$TMP_DOWNLOAD_DIR")" Downloader "$distributionUrl" "$(native_path "$targetZip")"
 220 | fi
 221 | 
 222 | # If specified, validate the SHA-256 sum of the Maven distribution zip file
 223 | if [ -n "${distributionSha256Sum-}" ]; then
 224 |   distributionSha256Result=false
 225 |   if [ "$MVN_CMD" = mvnd.sh ]; then
 226 |     echo "Checksum validation is not supported for maven-mvnd." >&2
 227 |     echo "Please disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
 228 |     exit 1
 229 |   elif command -v sha256sum >/dev/null; then
 230 |     if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | sha256sum -c >/dev/null 2>&1; then
 231 |       distributionSha256Result=true
 232 |     fi
 233 |   elif command -v shasum >/dev/null; then
 234 |     if echo "$distributionSha256Sum  $TMP_DOWNLOAD_DIR/$distributionUrlName" | shasum -a 256 -c >/dev/null 2>&1; then
 235 |       distributionSha256Result=true
 236 |     fi
 237 |   else
 238 |     echo "Checksum validation was requested but neither 'sha256sum' or 'shasum' are available." >&2
 239 |     echo "Please install either command, or disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties." >&2
 240 |     exit 1
 241 |   fi
 242 |   if [ $distributionSha256Result = false ]; then
 243 |     echo "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised." >&2
 244 |     echo "If you updated your Maven version, you need to update the specified distributionSha256Sum property." >&2
 245 |     exit 1
 246 |   fi
 247 | fi
 248 | 
 249 | # unzip and move
 250 | if command -v unzip >/dev/null; then
 251 |   unzip ${__MVNW_QUIET_UNZIP:+"$__MVNW_QUIET_UNZIP"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -d "$TMP_DOWNLOAD_DIR" || die "failed to unzip"
 252 | else
 253 |   tar xzf${__MVNW_QUIET_TAR:+"$__MVNW_QUIET_TAR"} "$TMP_DOWNLOAD_DIR/$distributionUrlName" -C "$TMP_DOWNLOAD_DIR" || die "failed to untar"
 254 | fi
 255 | printf %s\\n "$distributionUrl" >"$TMP_DOWNLOAD_DIR/$distributionUrlNameMain/mvnw.url"
 256 | mv -- "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" "$MAVEN_HOME" || [ -d "$MAVEN_HOME" ] || die "fail to move MAVEN_HOME"
 257 | 
 258 | clean || :
 259 | exec_maven "$@"

```

`chatbot/mvnw.cmd`:

```cmd
   1 | <# : batch portion
   2 | @REM ----------------------------------------------------------------------------
   3 | @REM Licensed to the Apache Software Foundation (ASF) under one
   4 | @REM or more contributor license agreements.  See the NOTICE file
   5 | @REM distributed with this work for additional information
   6 | @REM regarding copyright ownership.  The ASF licenses this file
   7 | @REM to you under the Apache License, Version 2.0 (the
   8 | @REM "License"); you may not use this file except in compliance
   9 | @REM with the License.  You may obtain a copy of the License at
  10 | @REM
  11 | @REM    http://www.apache.org/licenses/LICENSE-2.0
  12 | @REM
  13 | @REM Unless required by applicable law or agreed to in writing,
  14 | @REM software distributed under the License is distributed on an
  15 | @REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  16 | @REM KIND, either express or implied.  See the License for the
  17 | @REM specific language governing permissions and limitations
  18 | @REM under the License.
  19 | @REM ----------------------------------------------------------------------------
  20 | 
  21 | @REM ----------------------------------------------------------------------------
  22 | @REM Apache Maven Wrapper startup batch script, version 3.3.2
  23 | @REM
  24 | @REM Optional ENV vars
  25 | @REM   MVNW_REPOURL - repo url base for downloading maven distribution
  26 | @REM   MVNW_USERNAME/MVNW_PASSWORD - user and password for downloading maven
  27 | @REM   MVNW_VERBOSE - true: enable verbose log; others: silence the output
  28 | @REM ----------------------------------------------------------------------------
  29 | 
  30 | @IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
  31 | @SET __MVNW_CMD__=
  32 | @SET __MVNW_ERROR__=
  33 | @SET __MVNW_PSMODULEP_SAVE=%PSModulePath%
  34 | @SET PSModulePath=
  35 | @FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0'; $script='%__MVNW_ARG0_NAME__%'; icm -ScriptBlock ([Scriptblock]::Create((Get-Content -Raw '%~f0'))) -NoNewScope}"`) DO @(
  36 |   IF "%%A"=="MVN_CMD" (set __MVNW_CMD__=%%B) ELSE IF "%%B"=="" (echo %%A) ELSE (echo %%A=%%B)
  37 | )
  38 | @SET PSModulePath=%__MVNW_PSMODULEP_SAVE%
  39 | @SET __MVNW_PSMODULEP_SAVE=
  40 | @SET __MVNW_ARG0_NAME__=
  41 | @SET MVNW_USERNAME=
  42 | @SET MVNW_PASSWORD=
  43 | @IF NOT "%__MVNW_CMD__%"=="" (%__MVNW_CMD__% %*)
  44 | @echo Cannot start maven from wrapper >&2 && exit /b 1
  45 | @GOTO :EOF
  46 | : end batch / begin powershell #>
  47 | 
  48 | $ErrorActionPreference = "Stop"
  49 | if ($env:MVNW_VERBOSE -eq "true") {
  50 |   $VerbosePreference = "Continue"
  51 | }
  52 | 
  53 | # calculate distributionUrl, requires .mvn/wrapper/maven-wrapper.properties
  54 | $distributionUrl = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionUrl
  55 | if (!$distributionUrl) {
  56 |   Write-Error "cannot read distributionUrl property in $scriptDir/.mvn/wrapper/maven-wrapper.properties"
  57 | }
  58 | 
  59 | switch -wildcard -casesensitive ( $($distributionUrl -replace '^.*/','') ) {
  60 |   "maven-mvnd-*" {
  61 |     $USE_MVND = $true
  62 |     $distributionUrl = $distributionUrl -replace '-bin\.[^.]*$',"-windows-amd64.zip"
  63 |     $MVN_CMD = "mvnd.cmd"
  64 |     break
  65 |   }
  66 |   default {
  67 |     $USE_MVND = $false
  68 |     $MVN_CMD = $script -replace '^mvnw','mvn'
  69 |     break
  70 |   }
  71 | }
  72 | 
  73 | # apply MVNW_REPOURL and calculate MAVEN_HOME
  74 | # maven home pattern: ~/.m2/wrapper/dists/{apache-maven-<version>,maven-mvnd-<version>-<platform>}/<hash>
  75 | if ($env:MVNW_REPOURL) {
  76 |   $MVNW_REPO_PATTERN = if ($USE_MVND) { "/org/apache/maven/" } else { "/maven/mvnd/" }
  77 |   $distributionUrl = "$env:MVNW_REPOURL$MVNW_REPO_PATTERN$($distributionUrl -replace '^.*'+$MVNW_REPO_PATTERN,'')"
  78 | }
  79 | $distributionUrlName = $distributionUrl -replace '^.*/',''
  80 | $distributionUrlNameMain = $distributionUrlName -replace '\.[^.]*$','' -replace '-bin$',''
  81 | $MAVEN_HOME_PARENT = "$HOME/.m2/wrapper/dists/$distributionUrlNameMain"
  82 | if ($env:MAVEN_USER_HOME) {
  83 |   $MAVEN_HOME_PARENT = "$env:MAVEN_USER_HOME/wrapper/dists/$distributionUrlNameMain"
  84 | }
  85 | $MAVEN_HOME_NAME = ([System.Security.Cryptography.MD5]::Create().ComputeHash([byte[]][char[]]$distributionUrl) | ForEach-Object {$_.ToString("x2")}) -join ''
  86 | $MAVEN_HOME = "$MAVEN_HOME_PARENT/$MAVEN_HOME_NAME"
  87 | 
  88 | if (Test-Path -Path "$MAVEN_HOME" -PathType Container) {
  89 |   Write-Verbose "found existing MAVEN_HOME at $MAVEN_HOME"
  90 |   Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"
  91 |   exit $?
  92 | }
  93 | 
  94 | if (! $distributionUrlNameMain -or ($distributionUrlName -eq $distributionUrlNameMain)) {
  95 |   Write-Error "distributionUrl is not valid, must end with *-bin.zip, but found $distributionUrl"
  96 | }
  97 | 
  98 | # prepare tmp dir
  99 | $TMP_DOWNLOAD_DIR_HOLDER = New-TemporaryFile
 100 | $TMP_DOWNLOAD_DIR = New-Item -Itemtype Directory -Path "$TMP_DOWNLOAD_DIR_HOLDER.dir"
 101 | $TMP_DOWNLOAD_DIR_HOLDER.Delete() | Out-Null
 102 | trap {
 103 |   if ($TMP_DOWNLOAD_DIR.Exists) {
 104 |     try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
 105 |     catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
 106 |   }
 107 | }
 108 | 
 109 | New-Item -Itemtype Directory -Path "$MAVEN_HOME_PARENT" -Force | Out-Null
 110 | 
 111 | # Download and Install Apache Maven
 112 | Write-Verbose "Couldn't find MAVEN_HOME, downloading and installing it ..."
 113 | Write-Verbose "Downloading from: $distributionUrl"
 114 | Write-Verbose "Downloading to: $TMP_DOWNLOAD_DIR/$distributionUrlName"
 115 | 
 116 | $webclient = New-Object System.Net.WebClient
 117 | if ($env:MVNW_USERNAME -and $env:MVNW_PASSWORD) {
 118 |   $webclient.Credentials = New-Object System.Net.NetworkCredential($env:MVNW_USERNAME, $env:MVNW_PASSWORD)
 119 | }
 120 | [Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
 121 | $webclient.DownloadFile($distributionUrl, "$TMP_DOWNLOAD_DIR/$distributionUrlName") | Out-Null
 122 | 
 123 | # If specified, validate the SHA-256 sum of the Maven distribution zip file
 124 | $distributionSha256Sum = (Get-Content -Raw "$scriptDir/.mvn/wrapper/maven-wrapper.properties" | ConvertFrom-StringData).distributionSha256Sum
 125 | if ($distributionSha256Sum) {
 126 |   if ($USE_MVND) {
 127 |     Write-Error "Checksum validation is not supported for maven-mvnd. `nPlease disable validation by removing 'distributionSha256Sum' from your maven-wrapper.properties."
 128 |   }
 129 |   Import-Module $PSHOME\Modules\Microsoft.PowerShell.Utility -Function Get-FileHash
 130 |   if ((Get-FileHash "$TMP_DOWNLOAD_DIR/$distributionUrlName" -Algorithm SHA256).Hash.ToLower() -ne $distributionSha256Sum) {
 131 |     Write-Error "Error: Failed to validate Maven distribution SHA-256, your Maven distribution might be compromised. If you updated your Maven version, you need to update the specified distributionSha256Sum property."
 132 |   }
 133 | }
 134 | 
 135 | # unzip and move
 136 | Expand-Archive "$TMP_DOWNLOAD_DIR/$distributionUrlName" -DestinationPath "$TMP_DOWNLOAD_DIR" | Out-Null
 137 | Rename-Item -Path "$TMP_DOWNLOAD_DIR/$distributionUrlNameMain" -NewName $MAVEN_HOME_NAME | Out-Null
 138 | try {
 139 |   Move-Item -Path "$TMP_DOWNLOAD_DIR/$MAVEN_HOME_NAME" -Destination $MAVEN_HOME_PARENT | Out-Null
 140 | } catch {
 141 |   if (! (Test-Path -Path "$MAVEN_HOME" -PathType Container)) {
 142 |     Write-Error "fail to move MAVEN_HOME"
 143 |   }
 144 | } finally {
 145 |   try { Remove-Item $TMP_DOWNLOAD_DIR -Recurse -Force | Out-Null }
 146 |   catch { Write-Warning "Cannot remove $TMP_DOWNLOAD_DIR" }
 147 | }
 148 | 
 149 | Write-Output "MVN_CMD=$MAVEN_HOME/bin/$MVN_CMD"

```

`chatbot/pom.xml`:

```xml
   1 | <?xml version="1.0" encoding="UTF-8"?>
   2 | <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   3 | 	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
   4 | 	<modelVersion>4.0.0</modelVersion>
   5 | 	<parent>
   6 | 		<groupId>org.springframework.boot</groupId>
   7 | 		<artifactId>spring-boot-starter-parent</artifactId>
   8 | 		<version>3.4.4</version>
   9 | 		<relativePath/> <!-- lookup parent from repository -->
  10 | 	</parent>
  11 | 	<groupId>br.com.TrabalhoEngSoftwareFramework</groupId>
  12 | 	<artifactId>framework</artifactId>
  13 | 	<version>0.0.1-SNAPSHOT</version>
  14 | 	<name>chatbot</name>
  15 | 	<description>Projeto da disciplina de Engenharia de Software</description>
  16 | 	<url/>
  17 | 	<licenses>
  18 | 		<license/>
  19 | 	</licenses>
  20 | 	<developers>
  21 | 		<developer/>
  22 | 	</developers>
  23 | 	<scm>
  24 | 		<connection/>
  25 | 		<developerConnection/>
  26 | 		<tag/>
  27 | 		<url/>
  28 | 	</scm>
  29 | 	<properties>
  30 | 		<java.version>21</java.version>
  31 |     <spring-ai.version>1.0.0-M1</spring-ai.version>
  32 | 	</properties>
  33 | 	<dependencies>
  34 | 		<dependency>
  35 | 			<groupId>org.springframework.ai</groupId>
  36 | 			<artifactId>spring-ai-core</artifactId>
  37 | 		</dependency>
  38 | 		<dependency>
  39 | 			<groupId>org.springframework.boot</groupId>
  40 | 			<artifactId>spring-boot-starter-data-jpa</artifactId>
  41 | 		</dependency>
  42 | 		<dependency>
  43 | 			<groupId>org.springframework.boot</groupId>
  44 | 			<artifactId>spring-boot-starter-web</artifactId>
  45 | 		</dependency>
  46 | 		<dependency>
  47 |     		<groupId>jakarta.validation</groupId>
  48 |     		<artifactId>jakarta.validation-api</artifactId>
  49 |     		<version>3.0.2</version> </dependency>
  50 | 		<dependency>
  51 | 			<groupId>org.springframework.boot</groupId>
  52 | 			<artifactId>spring-boot-devtools</artifactId>
  53 | 			<scope>runtime</scope>
  54 | 			<optional>true</optional>
  55 | 		</dependency>
  56 | 		<dependency>
  57 | 			<groupId>org.postgresql</groupId>
  58 | 			<artifactId>postgresql</artifactId>
  59 | 			<scope>runtime</scope>
  60 | 		</dependency>
  61 | 		<dependency>
  62 | 			<groupId>org.springframework.boot</groupId>
  63 | 			<artifactId>spring-boot-starter-test</artifactId>
  64 | 			<scope>test</scope>
  65 | 			<exclusions>
  66 | 				<exclusion>
  67 | 					<groupId>com.vaadin.external.google</groupId>
  68 | 					<artifactId>android-json</artifactId>
  69 | 				</exclusion>
  70 | 			</exclusions>
  71 | 		</dependency>
  72 | 		<dependency>
  73 |       		<groupId>org.springframework.boot</groupId>
  74 |       		<artifactId>spring-boot-starter-security</artifactId>
  75 |     	</dependency>
  76 |     	<dependency>
  77 |       		<groupId>org.springframework.security</groupId>
  78 |       		<artifactId>spring-security-test</artifactId>
  79 |       		<scope>test</scope>
  80 |     	</dependency>
  81 |     	<dependency>
  82 | 			<groupId>com.auth0</groupId>
  83 |     		<artifactId>java-jwt</artifactId>
  84 |     		<version>4.4.0</version>
  85 |     	</dependency>
  86 | 		<dependency>
  87 | 			<groupId>org.springframework.ai</groupId>
  88 | 			<artifactId>spring-ai-openai-spring-boot-starter</artifactId>
  89 | 		</dependency>
  90 | 		<dependency>
  91 | 			<groupId>org.springframework.ai</groupId>
  92 | 			<artifactId>spring-ai-vertex-ai-gemini-spring-boot-starter</artifactId>
  93 | 		</dependency>
  94 | 		<dependency>
  95 | 			<groupId>org.springframework.ai</groupId>
  96 | 			<artifactId>spring-ai-anthropic-spring-boot-starter</artifactId>
  97 | 		</dependency>
  98 | 		<dependency>
  99 |     		<groupId>org.apache.tika</groupId>
 100 | 			<artifactId>tika-core</artifactId>
 101 | 			<version>2.9.1</version> 
 102 | 		</dependency>
 103 | 		<dependency>
 104 | 			<groupId>org.apache.tika</groupId>
 105 | 			<artifactId>tika-parsers-standard-package</artifactId>
 106 | 			<version>2.9.1</version> 
 107 | 		</dependency>
 108 | 	
 109 |    <dependency>
 110 |      <groupId>org.springframework</groupId>
 111 |      <artifactId>spring-core</artifactId>
 112 |      <version>6.2.8</version>
 113 |    </dependency>
 114 |         <dependency>
 115 |             <groupId>io.swagger.core.v3</groupId>
 116 |             <artifactId>swagger-annotations</artifactId>
 117 |             <version>2.2.20</version>
 118 |             <exclusions>
 119 |                 <exclusion>
 120 |                     <groupId>org.springframework.cloud</groupId>
 121 |                     <artifactId>spring-cloud-function-context</artifactId>
 122 |                 </exclusion>
 123 |             </exclusions>
 124 |         </dependency>
 125 |  </dependencies>
 126 | 
 127 |   <dependencyManagement>
 128 | 		<dependencies>
 129 | 			<dependency>
 130 | 				<groupId>org.springframework.ai</groupId>
 131 | 				<artifactId>spring-ai-bom</artifactId>
 132 | 				<version>${spring-ai.version}</version>
 133 | 				<type>pom</type>
 134 | 				<scope>import</scope>
 135 | 			</dependency>
 136 | 		</dependencies>
 137 | 	</dependencyManagement>
 138 | 
 139 | 	<build>
 140 |     <plugins>
 141 |       <plugin>
 142 |         <groupId>org.springframework.boot</groupId>
 143 |         <artifactId>spring-boot-maven-plugin</artifactId>
 144 |         <configuration>
 145 |           <skip>true</skip> </configuration>
 146 |       </plugin>
 147 |       <plugin>
 148 |            <groupId>org.apache.maven.plugins</groupId>
 149 |            <artifactId>maven-jar-plugin</artifactId>
 150 |            <version>3.3.0</version> </plugin>
 151 |     </plugins>
 152 |   </build>
 153 | 
 154 |   <repositories>
 155 | 		<repository>
 156 | 			<id>spring-milestones</id>
 157 | 			<name>Spring Milestones</name>
 158 | 			<url>https://repo.spring.io/milestone</url>
 159 | 			<snapshots>
 160 | 				<enabled>false</enabled>
 161 | 			</snapshots>
 162 | 		</repository>
 163 | 	</repositories>
 164 | </project>

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/ChatbotApplication.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework;
   2 | 
   3 | import org.springframework.boot.SpringApplication;
   4 | import org.springframework.boot.autoconfigure.SpringBootApplication;
   5 | import org.springframework.cloud.function.context.config.ContextFunctionCatalogAutoConfiguration;
   6 | import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
   7 | 
   8 | @EnableJpaAuditing
   9 | @SpringBootApplication(exclude = {ContextFunctionCatalogAutoConfiguration.class})
  10 | public class ChatbotApplication {
  11 | 
  12 | 	public static void main(String[] args) {
  13 | 		SpringApplication.run(ChatbotApplication.class, args);
  14 | 	}
  15 | 
  16 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/controller/AiController.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.controller;
   2 | 
   3 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
   4 | import br.com.TrabalhoEngSoftwareFramework.framework.service.AiService;
   5 | import org.springframework.beans.factory.annotation.Autowired;
   6 | import org.springframework.http.MediaType;
   7 | import org.springframework.security.core.Authentication;
   8 | import org.springframework.web.bind.annotation.*;
   9 | import reactor.core.publisher.Flux;
  10 | 
  11 | import java.util.List;
  12 | 
  13 | class CompletionRequest {
  14 |     private String systemPrompt;
  15 |     private String userPrompt;
  16 |     private Long noteId;
  17 |     private List<Long> sourceIds;
  18 |     private String provider;
  19 | 
  20 |     public String getSystemPrompt() { return systemPrompt; }
  21 |     public void setSystemPrompt(String systemPrompt) { this.systemPrompt = systemPrompt; }
  22 |     public String getUserPrompt() { return userPrompt; }
  23 |     public void setUserPrompt(String userPrompt) { this.userPrompt = userPrompt; }
  24 |     public Long getNoteId() { return noteId; }
  25 |     public void setNoteId(Long noteId) { this.noteId = noteId; }
  26 |     public List<Long> getSourceIds() { return sourceIds; }
  27 |     public void setSourceIds(List<Long> sourceIds) { this.sourceIds = sourceIds; }
  28 |     public String getProvider() { return provider; }
  29 |     public void setProvider(String provider) { this.provider = provider; }
  30 | }
  31 | 
  32 | @RestController
  33 | @RequestMapping("/api/ai")
  34 | public class AiController {
  35 | 
  36 |     private final AiService aiService;
  37 | 
  38 |     @Autowired
  39 |     public AiController(AiService aiService) {
  40 |         this.aiService = aiService;
  41 |     }
  42 | 
  43 |     @PostMapping("/complete")
  44 |     public String complete(@RequestBody CompletionRequest request, Authentication authentication) {
  45 |         UserEntity currentUser = (UserEntity) authentication.getPrincipal();
  46 |         return aiService.getCompletion(
  47 |             request.getSystemPrompt(),
  48 |             request.getUserPrompt(),
  49 |             request.getNoteId(),
  50 |             request.getSourceIds(),
  51 |             currentUser.getId(),
  52 |             request.getProvider()
  53 |         );
  54 |     }
  55 | 
  56 |     @PostMapping(value = "/complete-stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  57 |     public Flux<String> completeStream(@RequestBody CompletionRequest request, Authentication authentication) {
  58 |         UserEntity currentUser = (UserEntity) authentication.getPrincipal();
  59 |         return aiService.getStreamCompletion(
  60 |             request.getSystemPrompt(),
  61 |             request.getUserPrompt(),
  62 |             request.getNoteId(),
  63 |             request.getSourceIds(),
  64 |             currentUser.getId(),
  65 |             request.getProvider()
  66 |         );
  67 |     }
  68 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/controller/AuthenticationController.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.controller;
   2 | 
   3 | import jakarta.validation.Valid;
   4 | 
   5 | import org.springframework.beans.factory.annotation.Autowired;
   6 | import org.springframework.http.ResponseEntity;
   7 | import org.springframework.security.authentication.AuthenticationManager;
   8 | import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
   9 | import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
  10 | import org.springframework.web.bind.annotation.PostMapping;
  11 | import org.springframework.web.bind.annotation.RequestBody;
  12 | import org.springframework.web.bind.annotation.RequestMapping;
  13 | import org.springframework.web.bind.annotation.RestController;
  14 | 
  15 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.AuthenticationDTO;
  16 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.RegisterDTO;
  17 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.TokenDTO;
  18 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  19 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.AuthenticationFailureException;
  20 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
  21 | import br.com.TrabalhoEngSoftwareFramework.framework.infra.security.TokenService;
  22 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.UserRepository;
  23 | 
  24 | @RestController
  25 | @RequestMapping("auth")
  26 | public class AuthenticationController {
  27 | 	@Autowired
  28 | 	private AuthenticationManager authenticationManager;
  29 | 	
  30 | 	@Autowired
  31 | 	private UserRepository userRepository;
  32 | 	
  33 | 	@Autowired
  34 | 	private TokenService tokenService;
  35 | 	
  36 | 	@PostMapping("/login")
  37 | 	public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
  38 | 		if(data.email() == null || data.email().isEmpty()) throw new InvalidObjectDataException("Email can't be empty");
  39 | 		if(data.password() == null || data.password().isEmpty()) throw new InvalidObjectDataException("Password can't be empty");
  40 | 		try {
  41 | 			var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
  42 | 			var auth = this.authenticationManager.authenticate(usernamePassword);
  43 | 			var token = tokenService.generateToken((UserEntity) auth.getPrincipal());
  44 | 			return ResponseEntity.ok(new TokenDTO(token));
  45 | 		} catch (Exception ex) {
  46 | 			throw new AuthenticationFailureException("Invalid username or password");
  47 |     }
  48 | 	}
  49 | 	
  50 | 	@PostMapping("/register")
  51 | 	public ResponseEntity register(@RequestBody @Valid RegisterDTO data) {
  52 | 		if(this.userRepository.findByEmail(data.email()) != null) return ResponseEntity.badRequest().build();
  53 | 		if(data.fullName().trim().isEmpty()) throw new InvalidObjectDataException("Full name can't be empty");
  54 | 		if(data.password().isEmpty()) throw new InvalidObjectDataException("Password can't be empty");
  55 | 		String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
  56 | 		String fullName = data.fullName().trim();
  57 | 		String[] username = fullName.split(" ");
  58 | 		UserEntity newUser = new UserEntity(data.email(), username[0], fullName, encryptedPassword);
  59 | 		this.userRepository.save(newUser);
  60 | 		String token = tokenService.generateToken(newUser);
  61 | 		return ResponseEntity.ok(new TokenDTO(token));
  62 | 	}
  63 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/controller/DeckController.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.controller;
   2 | 
   3 | import org.springframework.beans.factory.annotation.Autowired;
   4 | import org.springframework.data.domain.Page;
   5 | import org.springframework.data.domain.Pageable;
   6 | import org.springframework.security.core.Authentication;
   7 | import org.springframework.web.bind.annotation.DeleteMapping;
   8 | import org.springframework.web.bind.annotation.GetMapping;
   9 | import org.springframework.web.bind.annotation.PathVariable;
  10 | import org.springframework.web.bind.annotation.PostMapping;
  11 | import org.springframework.web.bind.annotation.PutMapping;
  12 | import org.springframework.web.bind.annotation.RequestBody;
  13 | import org.springframework.web.bind.annotation.RequestMapping;
  14 | import org.springframework.web.bind.annotation.RequestParam;
  15 | import org.springframework.web.bind.annotation.RestController;
  16 | 
  17 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.DeckDTO;
  18 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.DeckSummaryDTO;
  19 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  20 | import br.com.TrabalhoEngSoftwareFramework.framework.service.DeckService;
  21 | 
  22 | @RestController
  23 | @RequestMapping("api/decks")
  24 | public class DeckController {
  25 | 
  26 |   @Autowired
  27 |   private DeckService deckService;
  28 | 
  29 |   @GetMapping
  30 |   public Page<DeckSummaryDTO> listDecks (
  31 |     @RequestParam(required = false) String title,
  32 |     @RequestParam(required = false) String topic,
  33 |     @RequestParam(defaultValue = "totalDueFlashcardsDesc") String sortType,
  34 |     Pageable pageable,
  35 |     Authentication authentication
  36 |   ) {
  37 |     UserEntity user = (UserEntity) authentication.getPrincipal();
  38 |     return deckService.listDecks(title, topic, user.getId(), sortType, pageable);
  39 |   }
  40 | 
  41 |   @PostMapping
  42 |   public void createDeck(@RequestBody DeckDTO deckDTO, Authentication authentication) {
  43 |     UserEntity user = (UserEntity) authentication.getPrincipal();
  44 |     deckService.createDeck(deckDTO, user.getId());
  45 |   }
  46 | 
  47 |   @PutMapping("/{deckId}")
  48 |   public DeckSummaryDTO updateDeck(
  49 |     @PathVariable Long deckId,
  50 |     @RequestBody DeckSummaryDTO deckSummaryDTO,
  51 |     Authentication authentication
  52 |   ) {
  53 |     UserEntity user = (UserEntity) authentication.getPrincipal();
  54 |     return deckService.updateDeck(deckId, deckSummaryDTO, user.getId());
  55 |   }
  56 | 
  57 |   @DeleteMapping("/{deckId}")
  58 |   public void deleteDeck(@PathVariable Long deckId, Authentication authentication) {
  59 |     UserEntity user = (UserEntity) authentication.getPrincipal();
  60 |     deckService.deleteDeck(deckId, user.getId());
  61 |   }
  62 | 
  63 |   @GetMapping("/get-flashcards-total/{deckId}")
  64 |   public long getFlashcardsTotal(@PathVariable Long deckId, Authentication authentication) {
  65 |     UserEntity user = (UserEntity) authentication.getPrincipal();
  66 |     return deckService.getFlashcardsTotal(deckId, user.getId());
  67 |   }
  68 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/controller/FlashcardController.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.controller;
   2 | 
   3 | import java.util.ArrayList;
   4 | import java.util.List;
   5 | 
   6 | import org.springframework.beans.factory.annotation.Autowired;
   7 | import org.springframework.data.domain.Page;
   8 | import org.springframework.data.domain.Pageable;
   9 | import org.springframework.http.ResponseEntity;
  10 | import org.springframework.http.HttpStatus;
  11 | import org.springframework.security.core.Authentication;
  12 | import org.springframework.web.bind.annotation.DeleteMapping;
  13 | import org.springframework.web.bind.annotation.GetMapping;
  14 | import org.springframework.web.bind.annotation.PathVariable;
  15 | import org.springframework.web.bind.annotation.PostMapping;
  16 | import org.springframework.web.bind.annotation.PutMapping;
  17 | import org.springframework.web.bind.annotation.RequestBody;
  18 | import org.springframework.web.bind.annotation.RequestMapping;
  19 | import org.springframework.web.bind.annotation.RequestParam;
  20 | import org.springframework.web.bind.annotation.RestController;
  21 | import org.springframework.web.server.ResponseStatusException;
  22 | 
  23 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteDTO;
  24 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserAnswerDTO;
  25 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
  26 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  27 | import br.com.TrabalhoEngSoftwareFramework.framework.service.FlashcardService;
  28 | import br.com.TrabalhoEngSoftwareFramework.framework.service.AiService;
  29 | import br.com.TrabalhoEngSoftwareFramework.framework.service.NoteService;
  30 | 
  31 | @RestController
  32 | @RequestMapping("api/flashcards")
  33 | public class FlashcardController {
  34 | 
  35 |   @Autowired
  36 |   private FlashcardService flashcardService;
  37 |   @Autowired
  38 |   private AiService aiService;
  39 |   @Autowired
  40 |   private NoteService noteService;
  41 | 
  42 |   public static class GenerateFlashcardsRequest {
  43 |     private int count = 5; // Default count
  44 |     private String provider;
  45 | 
  46 |     public int getCount() {
  47 |       return count;
  48 |     }
  49 | 
  50 |     public void setCount(int count) {
  51 |       this.count = count;
  52 |     }
  53 | 
  54 |     public String getProvider() {
  55 |         return provider;
  56 |     }
  57 | 
  58 |     public void setProvider(String provider) {
  59 |         this.provider = provider;
  60 |     }
  61 |   }
  62 | 
  63 |   @GetMapping
  64 |   public Page<FlashcardDTO> listFlashcards(
  65 |     @RequestParam(required = false) String word,
  66 |     @RequestParam(required = false) String flashcardFilter,
  67 |     @RequestParam(defaultValue = "lastReviewedAtDesc") String sortType,
  68 |     @RequestParam(required = true) Long deckId,
  69 |     Pageable pageable,
  70 |     Authentication authentication
  71 |   ) {
  72 |     UserEntity user = (UserEntity) authentication.getPrincipal();
  73 |     return flashcardService.listFlashcards(word, flashcardFilter, user.getId(), deckId, sortType, pageable);
  74 |   }
  75 | 
  76 |   @PostMapping("/{deckId}")
  77 |   public void createFlashcard(@RequestBody FlashcardDTO flashcardDTO, @PathVariable Long deckId) {
  78 |     flashcardService.createFlashcard(flashcardDTO, deckId);
  79 |   }
  80 | 
  81 |   @PutMapping("/{flashcardId}")
  82 |   public void updateFlashcard(
  83 |       @PathVariable Long flashcardId,
  84 |       @RequestBody FlashcardDTO flashcardDTO,
  85 |       Authentication authentication) {
  86 |     UserEntity user = (UserEntity) authentication.getPrincipal();
  87 |     flashcardService.updateFlashcard(flashcardId, flashcardDTO, user.getId());
  88 |   }
  89 | 
  90 |   @DeleteMapping("/{flashcardId}")
  91 |   public void deleteFlashcard(@PathVariable Long flashcardId, Authentication authentication) {
  92 |     UserEntity user = (UserEntity) authentication.getPrincipal();
  93 |     flashcardService.deleteFlashcard(flashcardId, user.getId());
  94 |   }
  95 | 
  96 |   @GetMapping("/{flashcardId}")
  97 |   public FlashcardDTO getFlashcardById(@PathVariable Long flashcardId, Authentication authentication) {
  98 |     UserEntity user = (UserEntity) authentication.getPrincipal();
  99 |     return flashcardService.getFlashcardById(flashcardId, user.getId());
 100 |   }
 101 | 
 102 |   @PutMapping("/evaluate-answer/{flashcardId}")
 103 |   public void evaluateAnswer(@PathVariable Long flashcardId, @RequestBody UserAnswerDTO answer, Authentication authentication) {
 104 |     UserEntity user = (UserEntity) authentication.getPrincipal();
 105 |     flashcardService.evaluateAnswer(flashcardId, answer, user.getId());
 106 |   }
 107 | 
 108 |   @PostMapping("/generate-from-note/{noteId}/deck/{deckId}")
 109 |   public ResponseEntity<List<FlashcardDTO>> generateFlashcardsFromNote(
 110 |       @PathVariable Long noteId,
 111 |       @PathVariable Long deckId,
 112 |       @RequestBody(required = false) GenerateFlashcardsRequest request,
 113 |       Authentication authentication) {
 114 |     UserEntity currentUser = (UserEntity) authentication.getPrincipal();
 115 | 
 116 |     NoteDTO note = noteService.getNoteById(noteId, currentUser.getId());
 117 |     if (note.getContent() == null || note.getContent().trim().isEmpty()) {
 118 |       // TODO: Colocar a exceção da nota
 119 |       throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Note content is empty, cannot generate flashcards.");
 120 |     }
 121 | 
 122 |     int count = (request != null) ? request.getCount() : 5;
 123 |     String provider = (request != null) ? request.getProvider() : "openAiChatClient";
 124 | 
 125 |     List<FlashcardDTO> suggestions = aiService.generateFlashcardSuggestions(note.getContent(),
 126 |         currentUser.getId(), count, provider);
 127 | 
 128 |     if (suggestions.isEmpty()) {
 129 |       return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ArrayList<>());
 130 |     }
 131 | 
 132 |     List<FlashcardDTO> createdFlashcards = flashcardService.createFlashcardsFromSuggestions(suggestions, deckId,
 133 |         currentUser.getId());
 134 |     return ResponseEntity.status(HttpStatus.CREATED).body(createdFlashcards);
 135 |   }
 136 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/controller/NoteController.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.controller;
   2 | 
   3 | import org.springframework.beans.factory.annotation.Autowired;
   4 | import org.springframework.data.domain.Page;
   5 | import org.springframework.data.domain.Pageable;
   6 | import org.springframework.security.core.Authentication;
   7 | import org.springframework.web.bind.annotation.DeleteMapping;
   8 | import org.springframework.web.bind.annotation.GetMapping;
   9 | import org.springframework.web.bind.annotation.PathVariable;
  10 | import org.springframework.web.bind.annotation.PostMapping;
  11 | import org.springframework.web.bind.annotation.PutMapping;
  12 | import org.springframework.web.bind.annotation.RequestBody;
  13 | import org.springframework.web.bind.annotation.RequestMapping;
  14 | import org.springframework.web.bind.annotation.RequestParam;
  15 | import org.springframework.web.bind.annotation.RestController;
  16 | 
  17 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteDTO;
  18 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteSummaryDTO;
  19 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteUpdateDTO;
  20 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  21 | import br.com.TrabalhoEngSoftwareFramework.framework.service.NoteService;
  22 | 
  23 | @RestController
  24 | @RequestMapping("api/notes")
  25 | public class NoteController {
  26 | 	
  27 | 	@Autowired
  28 | 	private NoteService noteService;
  29 | 	
  30 | 	@GetMapping("/{noteId}")
  31 | 	public NoteDTO getNoteById(@PathVariable long noteId, Authentication authentication) {
  32 | 		UserEntity user = (UserEntity) authentication.getPrincipal();
  33 | 		return noteService.getNoteById(noteId, user.getId());
  34 | 	}
  35 | 	
  36 | 	@GetMapping
  37 | 	public Page<NoteSummaryDTO> listNotes(
  38 | 			@RequestParam(required = false) String title, 
  39 | 			@RequestParam(defaultValue = "updatedAtDesc") String sortType,
  40 | 			Pageable pageable,
  41 | 			Authentication authentication) {
  42 | 		UserEntity user = (UserEntity) authentication.getPrincipal();
  43 | 		return noteService.listNotes(title, user.getId(), sortType, pageable);
  44 | 	}
  45 | 	
  46 | 	@PostMapping
  47 | 	public Long createNote(@RequestBody NoteDTO noteDTO, Authentication authentication) {
  48 | 		UserEntity user = (UserEntity) authentication.getPrincipal();
  49 | 		return noteService.createNote(noteDTO, user.getId());
  50 | 	}
  51 | 	
  52 | 	@PutMapping("/{noteId}")
  53 | 	public NoteDTO updateNote(
  54 | 			@PathVariable Long noteId,
  55 | 			@RequestBody NoteUpdateDTO updateDTO,
  56 | 			Authentication authentication) {
  57 | 		UserEntity user = (UserEntity) authentication.getPrincipal();
  58 | 		return noteService.updateNote(noteId, updateDTO, user.getId());
  59 | 	}
  60 | 	
  61 | 	@DeleteMapping("/{noteId}")
  62 | 	public void deleteNote(@PathVariable Long noteId, Authentication authentication) {
  63 | 		UserEntity user = (UserEntity) authentication.getPrincipal();
  64 | 		noteService.deleteNote(noteId, user.getId());
  65 | 	}
  66 | 	
  67 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/controller/SourceController.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.controller;
   2 | 
   3 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.SourceDTO;
   4 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
   5 | import br.com.TrabalhoEngSoftwareFramework.framework.service.SourceService;
   6 | import org.springframework.beans.factory.annotation.Autowired;
   7 | import org.springframework.http.HttpStatus;
   8 | import org.springframework.http.ResponseEntity;
   9 | import org.springframework.security.core.Authentication;
  10 | import org.springframework.web.bind.annotation.*;
  11 | import org.springframework.web.multipart.MultipartFile;
  12 | 
  13 | import java.util.List;
  14 | 
  15 | @CrossOrigin(origins = "http://localhost:5173") //FIXME: provavelmente desnecessário, colocado pra tentar resolver um bug
  16 | @RestController
  17 | @RequestMapping("/api/notes/{noteId}/sources") // URL base para o controlador, endpoint para a nota específica
  18 | public class SourceController {
  19 | 
  20 |     @Autowired
  21 |     private SourceService sourceService;
  22 | 
  23 |     @PostMapping
  24 |     public ResponseEntity<SourceDTO> uploadSource(
  25 |             @PathVariable Long noteId,
  26 |             @RequestParam("file") MultipartFile file,
  27 |             Authentication authentication) {
  28 |         UserEntity user = (UserEntity) authentication.getPrincipal();
  29 |         SourceDTO uploadedSource = sourceService.uploadSource(noteId, user.getId(), file);
  30 |         return ResponseEntity.status(HttpStatus.CREATED).body(uploadedSource);
  31 |     }
  32 | 
  33 |     @GetMapping
  34 |     public ResponseEntity<List<SourceDTO>> getSourcesByNoteId(
  35 |             @PathVariable Long noteId,
  36 |             Authentication authentication) {
  37 |         UserEntity user = (UserEntity) authentication.getPrincipal();
  38 |         List<SourceDTO> sources = sourceService.getSourcesByNoteId(noteId, user.getId());
  39 |         return ResponseEntity.ok(sources);
  40 |     }
  41 | 
  42 |     // Não é necessário o noteId aqui, pois o sourceId já é suficiente para identificar o arquivo:
  43 |     @DeleteMapping("/{sourceId}")
  44 |     public ResponseEntity<Void> deleteSource(
  45 |             @PathVariable Long noteId, // Não é necessário (mas já que está na url...)
  46 |             @PathVariable Long sourceId,
  47 |             Authentication authentication) {
  48 |         UserEntity user = (UserEntity) authentication.getPrincipal();
  49 |         sourceService.deleteSource(sourceId, user.getId());
  50 |         return ResponseEntity.noContent().build();
  51 |     }
  52 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/controller/TopicController.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.controller;
   2 | 
   3 | import java.util.Collection;
   4 | 
   5 | import org.springframework.beans.factory.annotation.Autowired;
   6 | import org.springframework.web.bind.annotation.GetMapping;
   7 | import org.springframework.web.bind.annotation.RequestMapping;
   8 | import org.springframework.web.bind.annotation.RestController;
   9 | 
  10 | import br.com.TrabalhoEngSoftwareFramework.framework.service.TopicService;
  11 | 
  12 | @RestController
  13 | @RequestMapping("api/topics")
  14 | public class TopicController {
  15 | 
  16 |   @Autowired
  17 |   private TopicService topics;
  18 | 
  19 |   @GetMapping
  20 |   public Collection<String> getAllTopics() {
  21 |     return topics.getAllTopics();
  22 |   }
  23 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/controller/UserController.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.controller;
   2 | 
   3 | import org.springframework.beans.factory.annotation.Autowired;
   4 | import org.springframework.security.core.Authentication;
   5 | import org.springframework.web.bind.annotation.CrossOrigin;
   6 | import org.springframework.web.bind.annotation.DeleteMapping;
   7 | import org.springframework.web.bind.annotation.GetMapping;
   8 | import org.springframework.web.bind.annotation.PutMapping;
   9 | import org.springframework.web.bind.annotation.RequestBody;
  10 | import org.springframework.web.bind.annotation.RequestMapping;
  11 | import org.springframework.web.bind.annotation.RestController;
  12 | 
  13 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.UpdatePasswordDTO;
  14 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserDTO;
  15 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  16 | import br.com.TrabalhoEngSoftwareFramework.framework.service.UserService;
  17 | 
  18 | @CrossOrigin(origins = "http://localhost:5173")
  19 | @RestController
  20 | @RequestMapping(value = "api/users")
  21 | public class UserController {
  22 | 	
  23 | 	@Autowired	
  24 | 	private UserService userService;
  25 | 	
  26 | 	@GetMapping
  27 | 	public UserDTO getUserById(Authentication authentication) {
  28 | 		UserEntity user = (UserEntity) authentication.getPrincipal();
  29 | 		return userService.getUserById(user.getId());
  30 | 	}
  31 | 
  32 | 	@PutMapping("/update-user-informations")
  33 | 	public UserDTO updateUserPersonalInformations(@RequestBody UserDTO userDTO, Authentication authentication) {
  34 | 		UserEntity user = (UserEntity) authentication.getPrincipal();
  35 | 		return userService.updateUserPersonalInformations(userDTO, user.getId());
  36 | 	}
  37 | 
  38 | 	@PutMapping("/update-user-password")
  39 | 	public void updateUserPassword(@RequestBody UpdatePasswordDTO updatePasswordDTO, Authentication authentication) {
  40 | 		UserEntity user = (UserEntity) authentication.getPrincipal();
  41 | 		userService.updateUserPassword(updatePasswordDTO, user.getId());
  42 | 	}
  43 | 	
  44 | 	@DeleteMapping
  45 | 	public void deleteUser(Authentication authentication) {
  46 | 		UserEntity user = (UserEntity) authentication.getPrincipal();
  47 | 		userService.deleteUser(user.getId());
  48 | 	}
  49 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/AuthenticationDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | public record AuthenticationDTO(String email, String password) {
   4 | 	
   5 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/DeckDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | import java.time.LocalDateTime;
   4 | import java.util.ArrayList;
   5 | import java.util.List;
   6 | 
   7 | import org.springframework.beans.BeanUtils;
   8 | 
   9 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.DeckEntity;
  10 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
  11 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  12 | 
  13 | public class DeckDTO {
  14 | 	
  15 | 	private Long id;
  16 | 	private String title;
  17 | 	private String topic;
  18 | 	private LocalDateTime createdAt;
  19 | 	private LocalDateTime lastReviewedAt;
  20 | 	private UserEntity userEntity;
  21 | 	private List<FlashcardEntity> flashcards = new ArrayList<>();
  22 | 	
  23 | 	public DeckDTO(DeckEntity deck) {
  24 | 		BeanUtils.copyProperties(deck, this);
  25 | 	}
  26 | 	
  27 | 	public DeckDTO() {
  28 | 		
  29 | 	}
  30 | 
  31 | 	public Long getId() {
  32 | 		return id;
  33 | 	}
  34 | 
  35 | 	public void setId(Long id) {
  36 | 		this.id = id;
  37 | 	}
  38 | 
  39 | 	public String getTitle() {
  40 | 		return title;
  41 | 	}
  42 | 
  43 | 	public void setTitle(String title) {
  44 | 		this.title = title;
  45 | 	}
  46 | 
  47 | 	public String getTopic() {
  48 | 		return topic;
  49 | 	}
  50 | 
  51 | 	public void setTopic(String topic) {
  52 | 		this.topic = topic;
  53 | 	}
  54 | 
  55 | 	public LocalDateTime getCreatedAt() {
  56 | 		return createdAt;
  57 | 	}
  58 | 
  59 | 	public void setCreatedAt(LocalDateTime createdAt) {
  60 | 		this.createdAt = createdAt;
  61 | 	}
  62 | 
  63 | 	public LocalDateTime getLastReviewedAt() {
  64 | 		return lastReviewedAt;
  65 | 	}
  66 | 
  67 | 	public void setLastReviewedAt(LocalDateTime lastReviewedAt) {
  68 | 		this.lastReviewedAt = lastReviewedAt;
  69 | 	}
  70 | 
  71 | 	public UserEntity getUserEntity() {
  72 | 		return userEntity;
  73 | 	}
  74 | 
  75 | 	public void setUserEntity(UserEntity userEntity) {
  76 | 		this.userEntity = userEntity;
  77 | 	}
  78 | 
  79 | 	public List<FlashcardEntity> getFlashcards() {
  80 | 		return flashcards;
  81 | 	}
  82 | 
  83 | 	public void setFlashcards(List<FlashcardEntity> flashcards) {
  84 | 		this.flashcards = flashcards;
  85 | 	}
  86 | 	
  87 | 	
  88 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/DeckSummaryDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | import java.time.LocalDateTime;
   4 | 
   5 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.DeckEntity;
   6 | 
   7 | public class DeckSummaryDTO {
   8 | 
   9 |   private Long id;
  10 | 	private String title;
  11 | 	private String topic;
  12 | 	private LocalDateTime createdAt;
  13 | 	private LocalDateTime lastReviewedAt;
  14 | 
  15 |   public DeckSummaryDTO(DeckEntity deck) {
  16 |     this.id = deck.getId();
  17 |     this.title = deck.getTitle();
  18 |     this.topic = deck.getTopic();
  19 |     this.createdAt = deck.getCreatedAt();
  20 |     this.lastReviewedAt = deck.getLastReviewedAt();
  21 |   }
  22 | 
  23 |   public DeckSummaryDTO() {
  24 |     
  25 |   }
  26 | 
  27 |   public Long getId() {
  28 |     return id;
  29 |   }
  30 | 
  31 |   public void setId(Long id) {
  32 |     this.id = id;
  33 |   }
  34 | 
  35 |   public String getTitle() {
  36 |     return title;
  37 |   }
  38 | 
  39 |   public void setTitle(String title) {
  40 |     this.title = title;
  41 |   }
  42 | 
  43 |   public String getTopic() {
  44 |     return topic;
  45 |   }
  46 | 
  47 |   public void setTopic(String topic) {
  48 |     this.topic = topic;
  49 |   }
  50 | 
  51 |   public LocalDateTime getCreatedAt() {
  52 |     return createdAt;
  53 |   }
  54 | 
  55 |   public void setCreatedAt(LocalDateTime createdAt) {
  56 |     this.createdAt = createdAt;
  57 |   }
  58 | 
  59 |   public LocalDateTime getLastReviewedAt() {
  60 |     return lastReviewedAt;
  61 |   }
  62 | 
  63 |   public void setLastReviewedAt(LocalDateTime lastReviewedAt) {
  64 |     this.lastReviewedAt = lastReviewedAt;
  65 |   }
  66 |   
  67 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/FlashcardDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | import java.time.LocalDateTime;
   4 | 
   5 | import com.fasterxml.jackson.annotation.JsonTypeInfo;
   6 | 
   7 | 
   8 | @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
   9 | public abstract class FlashcardDTO {
  10 | 	
  11 | 	protected LocalDateTime createdAt;
  12 | 	protected LocalDateTime lastReviewedAt;
  13 | 	protected String flashcardType;
  14 | 	
  15 | 	public FlashcardDTO() {
  16 | 		
  17 | 	}
  18 | 
  19 | 	public LocalDateTime getCreatedAt() {
  20 | 		return createdAt;
  21 | 	}
  22 | 
  23 | 	public void setCreatedAt(LocalDateTime createdAt) {
  24 | 		this.createdAt = createdAt;
  25 | 	}
  26 | 
  27 | 	public LocalDateTime getLastReviewedAt() {
  28 | 		return lastReviewedAt;
  29 | 	}
  30 | 
  31 | 	public void setLastReviewedAt(LocalDateTime lastReviewedAt) {
  32 | 		this.lastReviewedAt = lastReviewedAt;
  33 | 	}
  34 | 
  35 | 	public String getFlashcardType() {
  36 | 		return flashcardType;
  37 | 	}
  38 | 
  39 | 	public void setFlashcardType(String flashcardType) {
  40 | 		this.flashcardType = flashcardType;
  41 | 	}
  42 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/NoteDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | import java.time.LocalDateTime;
   4 | 
   5 | import org.springframework.beans.BeanUtils;
   6 | 
   7 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;
   8 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
   9 | 
  10 | public class NoteDTO {
  11 | 
  12 | 	private Long id;
  13 | 	private String title;
  14 | 	private String subtitle;
  15 | 	private String content;
  16 | 	private LocalDateTime createdAt;
  17 | 	private LocalDateTime updatedAt;
  18 | 	private UserEntity userEntity;
  19 | 	
  20 | 	public NoteDTO(NoteEntity note) {
  21 | 		BeanUtils.copyProperties(note, this);
  22 | 	}
  23 | 	
  24 | 	public NoteDTO() {
  25 | 		
  26 | 	}
  27 | 
  28 | 	public Long getId() {
  29 | 		return id;
  30 | 	}
  31 | 
  32 | 	public void setId(Long id) {
  33 | 		this.id = id;
  34 | 	}
  35 | 
  36 | 	public String getTitle() {
  37 | 		return title;
  38 | 	}
  39 | 
  40 | 	public void setTitle(String title) {
  41 | 		this.title = title;
  42 | 	}
  43 | 	
  44 | 	public String getSubtitle() {
  45 | 		return subtitle;
  46 | 	}
  47 | 
  48 | 	public void setSubtitle(String subtitle) {
  49 | 		this.subtitle = subtitle;
  50 | 	}
  51 | 
  52 | 
  53 | 	public String getContent() {
  54 | 		return content;
  55 | 	}
  56 | 
  57 | 	public void setContent(String content) {
  58 | 		this.content = content;
  59 | 	}
  60 | 
  61 | 	public LocalDateTime getCreatedAt() {
  62 | 		return createdAt;
  63 | 	}
  64 | 
  65 | 	public void setCreatedAt(LocalDateTime createdAt) {
  66 | 		this.createdAt = createdAt;
  67 | 	}
  68 | 
  69 | 	public LocalDateTime getUpdatedAt() {
  70 | 		return updatedAt;
  71 | 	}
  72 | 
  73 | 	public void setUpdatedAt(LocalDateTime updatedAt) {
  74 | 		this.updatedAt = updatedAt;
  75 | 	}
  76 | 
  77 | 	public UserEntity getUserEntity() {
  78 | 		return userEntity;
  79 | 	}
  80 | 
  81 | 	public void setUserEntity(UserEntity userEntity) {
  82 | 		this.userEntity = userEntity;
  83 | 	}
  84 | 	
  85 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/NoteSummaryDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | import java.time.LocalDateTime;
   4 | 
   5 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;
   6 | 
   7 | public class NoteSummaryDTO {
   8 | 	private Long id;
   9 | 	private String title;
  10 |   private String subtitle;
  11 |   private LocalDateTime updatedAt;
  12 |   private LocalDateTime createdAt;
  13 | 
  14 |   public NoteSummaryDTO(NoteEntity entity) {
  15 |   	this.id = entity.getId();
  16 |     this.title = entity.getTitle();
  17 |     this.subtitle = entity.getSubtitle();
  18 |     this.updatedAt = entity.getUpdatedAt();
  19 |     this.createdAt = entity.getCreatedAt();
  20 |   }
  21 | 
  22 | 	public Long getId() {
  23 | 		return id;
  24 | 	}
  25 | 
  26 | 	public void setId(Long id) {
  27 | 		this.id = id;
  28 | 	}
  29 | 
  30 | 	public String getTitle() {
  31 | 		return title;
  32 | 	}
  33 | 
  34 | 	public void setTitle(String title) {
  35 | 		this.title = title;
  36 | 	}
  37 | 
  38 | 	public String getSubtitle() {
  39 | 		return subtitle;
  40 | 	}
  41 | 
  42 | 	public void setSubtitle(String subtitle) {
  43 | 		this.subtitle = subtitle;
  44 | 	}
  45 | 
  46 | 	public LocalDateTime getUpdatedAt() {
  47 | 		return updatedAt;
  48 | 	}
  49 | 
  50 | 	public void setUpdatedAt(LocalDateTime updatedAt) {
  51 | 		this.updatedAt = updatedAt;
  52 | 	}
  53 | 
  54 | 	public LocalDateTime getCreatedAt() {
  55 | 		return createdAt;
  56 | 	}
  57 | 
  58 | 	public void setCreatedAt(LocalDateTime createdAt) {
  59 | 		this.createdAt = createdAt;
  60 | 	}
  61 |     
  62 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/NoteUpdateDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | public class NoteUpdateDTO {
   4 | 	private String title;
   5 |   private String content;
   6 |   private String subtitle;
   7 |     
   8 | 	public String getTitle() {
   9 | 		return title;
  10 | 	}
  11 | 	public void setTitle(String title) {
  12 | 		this.title = title;
  13 | 	}
  14 | 	public String getContent() {
  15 | 		return content;
  16 | 	}
  17 | 	public void setContent(String content) {
  18 | 		this.content = content;
  19 | 	}
  20 | 	public String getSubtitle() {
  21 | 		return subtitle;
  22 | 	}
  23 | 	public void setSubtitle(String subtitle) {
  24 | 		this.subtitle = subtitle;
  25 | 	}
  26 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/RegisterDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | public record RegisterDTO(String email, String fullName, String password) {
   4 | 
   5 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/SourceDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | import java.time.LocalDateTime;
   4 | 
   5 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.SourceEntity;
   6 | 
   7 | public class SourceDTO {
   8 | 
   9 |     private Long id;
  10 |     private String fileName;
  11 |     //private String filePath;
  12 |     private LocalDateTime createdAt;
  13 | 
  14 |     // Constructor from Entity
  15 |     public SourceDTO(SourceEntity source) {
  16 |         this.id = source.getId();
  17 |         this.fileName = source.getFileName();
  18 |         // this.filePath = source.getFilePath(); // Considerar se você quer expor o caminho completo ou uma URL para download
  19 |         this.createdAt = source.getCreatedAt();
  20 |     }
  21 | 
  22 |     // Getters
  23 |     public Long getId() {
  24 |         return id;
  25 |     }
  26 | 
  27 |     public String getFileName() {
  28 |         return fileName;
  29 |     }
  30 | 
  31 |     /* public String getFilePath() {
  32 |         return filePath;
  33 |     } */
  34 | 
  35 |     public LocalDateTime getCreatedAt() {
  36 |         return createdAt;
  37 |     }
  38 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/TokenDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | public record TokenDTO(String token) {
   4 | 
   5 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/UpdatePasswordDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | public class UpdatePasswordDTO {
   4 |   private String currentPassword;
   5 |   private String newPassword;
   6 |   private String confirmNewPassword;
   7 | 
   8 |   public String getCurrentPassword() {
   9 |     return currentPassword;
  10 |   }
  11 |   
  12 |   public void setCurrentPassword(String currentPassword) {
  13 |     this.currentPassword = currentPassword;
  14 |   }
  15 |   
  16 |   public String getNewPassword() {
  17 |     return newPassword;
  18 |   }
  19 |   
  20 |   public void setNewPassword(String newPassword) {
  21 |     this.newPassword = newPassword;
  22 |   }
  23 |   
  24 |   public String getConfirmNewPassword() {
  25 |     return confirmNewPassword;
  26 |   }
  27 |   
  28 |   public void setConfirmNewPassword(String confirmNewPassword) {
  29 |     this.confirmNewPassword = confirmNewPassword;
  30 |   }
  31 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/UserAnswerDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | import com.fasterxml.jackson.annotation.JsonTypeInfo;
   4 | 
   5 | @JsonTypeInfo(
   6 |     use = JsonTypeInfo.Id.NAME,
   7 |     include = JsonTypeInfo.As.EXISTING_PROPERTY,
   8 |     property = "flashcardType",
   9 |     visible = true
  10 | )
  11 | public abstract class UserAnswerDTO {
  12 | 
  13 |     // Identificador único do flashcard ao qual esta resposta se refere
  14 |     protected Long flashcardId; 
  15 |     
  16 |     // O tipo do flashcard, essencial para o roteamento correto no backend
  17 |     protected String flashcardType; 
  18 |   
  19 |     public UserAnswerDTO() {
  20 |         // Inicialização padrão ou vazia
  21 |     }
  22 | 
  23 |     public UserAnswerDTO(Long flashcardId, String flashcardType) {
  24 |         this.flashcardId = flashcardId;
  25 |         this.flashcardType = flashcardType;
  26 |     }
  27 | 
  28 |     // --- Getters e Setters ---
  29 | 
  30 |     public Long getFlashcardId() {
  31 |         return flashcardId;
  32 |     }
  33 | 
  34 |     public void setFlashcardId(Long flashcardId) {
  35 |         this.flashcardId = flashcardId;
  36 |     }
  37 | 
  38 |     public String getFlashcardType() {
  39 |         return flashcardType;
  40 |     }
  41 | 
  42 |     public void setFlashcardType(String flashcardType) {
  43 |         this.flashcardType = flashcardType;
  44 |     }
  45 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/dto/UserDTO.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.dto;
   2 | 
   3 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
   4 | 
   5 | public class UserDTO {
   6 | 	
   7 | 	private Long id;
   8 | 	private String username;
   9 | 	private String fullName;
  10 | 	private String email;
  11 | 	
  12 | 	public UserDTO(UserEntity user) {
  13 | 		this.id = user.getId();
  14 | 		this.username = user.getUserName();
  15 | 		this.fullName = user.getFullName();
  16 | 		this.email = user.getEmail();
  17 | 	}
  18 | 	
  19 | 	public UserDTO() {
  20 | 		
  21 | 	}
  22 | 	
  23 | 	public Long getId() {
  24 | 		return id;
  25 | 	}
  26 | 
  27 | 	public void setId(Long id) {
  28 | 		this.id = id;
  29 | 	}
  30 | 
  31 | 	public String getUsername() {
  32 | 		return username;
  33 | 	}
  34 | 
  35 | 	public void setUsername(String username) {
  36 | 		this.username = username;
  37 | 	}
  38 | 
  39 | 	public String getFullName() {
  40 | 		return fullName;
  41 | 	}
  42 | 
  43 | 	public void setFullName(String fullName) {
  44 | 		this.fullName = fullName;
  45 | 	}
  46 | 	
  47 | 	public String getEmail() {
  48 | 		return email;
  49 | 	}
  50 | 	
  51 | 	public void setEmail(String email) {
  52 | 		this.email = email;
  53 | 	}
  54 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/entity/DeckEntity.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.entity;
   2 | 
   3 | import java.time.LocalDateTime;
   4 | import java.util.ArrayList;
   5 | import java.util.List;
   6 | import java.util.Objects;
   7 | 
   8 | import org.springframework.beans.BeanUtils;
   9 | import org.springframework.data.annotation.CreatedDate;
  10 | import org.springframework.data.jpa.domain.support.AuditingEntityListener;
  11 | 
  12 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.DeckDTO;
  13 | import jakarta.persistence.CascadeType;
  14 | import jakarta.persistence.Column;
  15 | import jakarta.persistence.Entity;
  16 | import jakarta.persistence.EntityListeners;
  17 | import jakarta.persistence.FetchType;
  18 | import jakarta.persistence.GeneratedValue;
  19 | import jakarta.persistence.GenerationType;
  20 | import jakarta.persistence.Id;
  21 | import jakarta.persistence.JoinColumn;
  22 | import jakarta.persistence.ManyToOne;
  23 | import jakarta.persistence.OneToMany;
  24 | import jakarta.persistence.Table;
  25 | 
  26 | @Entity
  27 | @Table(name = "tb_deck")
  28 | @EntityListeners(AuditingEntityListener.class)
  29 | public class DeckEntity {
  30 | 	
  31 | 	@Id
  32 | 	@GeneratedValue(strategy = GenerationType.IDENTITY)
  33 | 	private Long id;
  34 | 	
  35 | 	@Column(nullable = false)
  36 | 	private String title;
  37 | 	
  38 | 	@Column
  39 | 	private String topic;
  40 | 	
  41 | 	@CreatedDate
  42 | 	@Column(nullable = false, updatable = false)
  43 | 	private LocalDateTime createdAt;
  44 | 	
  45 | 	@Column
  46 | 	private LocalDateTime lastReviewedAt;
  47 | 
  48 | 	@OneToMany(mappedBy = "deckEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  49 | 	private List<FlashcardEntity> flashcards = new ArrayList<>();
  50 | 	
  51 | 	@ManyToOne
  52 | 	@JoinColumn(name="user_id")
  53 | 	private UserEntity userEntity;
  54 | 	
  55 | 	public DeckEntity(DeckDTO deck) {
  56 | 		BeanUtils.copyProperties(deck, this);
  57 | 	}
  58 | 	
  59 | 	public DeckEntity() {
  60 | 		
  61 | 	}
  62 | 
  63 | 	public DeckEntity(Long id) {
  64 | 		this.id = id;
  65 | 	}
  66 | 
  67 | 	@Override
  68 | 	public int hashCode() {
  69 | 		return Objects.hash(id);
  70 | 	}
  71 | 
  72 | 	@Override
  73 | 	public boolean equals(Object obj) {
  74 | 		if (this == obj)
  75 | 			return true;
  76 | 		if (obj == null)
  77 | 			return false;
  78 | 		if (getClass() != obj.getClass())
  79 | 			return false;
  80 | 		DeckEntity other = (DeckEntity) obj;
  81 | 		return Objects.equals(id, other.id);
  82 | 	}
  83 | 
  84 | 	public Long getId() {
  85 | 		return id;
  86 | 	}
  87 | 
  88 | 	public void setId(Long id) {
  89 | 		this.id = id;
  90 | 	}
  91 | 
  92 | 	public String getTitle() {
  93 | 		return title;
  94 | 	}
  95 | 
  96 | 	public void setTitle(String title) {
  97 | 		this.title = title;
  98 | 	}
  99 | 
 100 | 	public String getTopic() {
 101 | 		return topic;
 102 | 	}
 103 | 
 104 | 	public void setTopic(String topic) {
 105 | 		this.topic = topic;
 106 | 	}
 107 | 
 108 | 	public LocalDateTime getCreatedAt() {
 109 | 		return createdAt;
 110 | 	}
 111 | 
 112 | 	public void setCreatedAt(LocalDateTime createdAt) {
 113 | 		this.createdAt = createdAt;
 114 | 	}
 115 | 
 116 | 	public LocalDateTime getLastReviewedAt() {
 117 | 		return lastReviewedAt;
 118 | 	}
 119 | 
 120 | 	public void setLastReviewedAt(LocalDateTime lastReviewedAt) {
 121 | 		this.lastReviewedAt = lastReviewedAt;
 122 | 	}
 123 | 
 124 | 	public List<FlashcardEntity> getFlashcards() {
 125 | 		return flashcards;
 126 | 	}
 127 | 
 128 | 	public void setFlashcards(List<FlashcardEntity> flashcards) {
 129 | 		this.flashcards = flashcards;
 130 | 	}
 131 | 
 132 | 	public UserEntity getUserEntity() {
 133 | 		return userEntity;
 134 | 	}
 135 | 
 136 | 	public void setUserEntity(UserEntity userEntity) {
 137 | 		this.userEntity = userEntity;
 138 | 	}
 139 | 	
 140 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/entity/FlashcardEntity.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.entity;
   2 | 
   3 | import java.time.LocalDateTime;
   4 | import java.util.Objects;
   5 | 
   6 | import org.springframework.data.annotation.CreatedDate;
   7 | import org.springframework.data.jpa.domain.support.AuditingEntityListener;
   8 | 
   9 | import jakarta.persistence.Column;
  10 | import jakarta.persistence.DiscriminatorColumn;
  11 | import jakarta.persistence.DiscriminatorType;
  12 | import jakarta.persistence.Entity;
  13 | import jakarta.persistence.EntityListeners;
  14 | import jakarta.persistence.GeneratedValue;
  15 | import jakarta.persistence.GenerationType;
  16 | import jakarta.persistence.Id;
  17 | import jakarta.persistence.Inheritance;
  18 | import jakarta.persistence.InheritanceType;
  19 | import jakarta.persistence.JoinColumn;
  20 | import jakarta.persistence.ManyToOne;
  21 | import jakarta.persistence.Table;
  22 | 
  23 | @Entity
  24 | @Table(name = "tb_flashcard")
  25 | @EntityListeners(AuditingEntityListener.class)
  26 | @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
  27 | @DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
  28 | public abstract class FlashcardEntity {
  29 | 	
  30 | 	@Id
  31 | 	@GeneratedValue(strategy = GenerationType.IDENTITY)
  32 | 	protected Long id;
  33 | 	
  34 | 	@CreatedDate
  35 | 	@Column(nullable = false, updatable = false)
  36 | 	protected LocalDateTime createdAt;
  37 | 	
  38 | 	@Column
  39 | 	protected LocalDateTime lastReviewedAt;
  40 | 
  41 | 	@Column(nullable = false)
  42 | 	protected String flashcardType;
  43 | 	
  44 | 	@ManyToOne
  45 | 	@JoinColumn(name="deck_id")
  46 | 	protected DeckEntity deckEntity;
  47 | 	
  48 | 	public FlashcardEntity() {
  49 | 		
  50 | 	}
  51 | 
  52 | 	@Override
  53 | 	public int hashCode() {
  54 | 		return Objects.hash(id);
  55 | 	}
  56 | 
  57 | 	@Override
  58 | 	public boolean equals(Object obj) {
  59 | 		if (this == obj)
  60 | 			return true;
  61 | 		if (obj == null)
  62 | 			return false;
  63 | 		if (getClass() != obj.getClass())
  64 | 			return false;
  65 | 		FlashcardEntity other = (FlashcardEntity) obj;
  66 | 		return Objects.equals(id, other.id);
  67 | 	}
  68 | 
  69 | 	public Long getId() {
  70 | 		return id;
  71 | 	}
  72 | 
  73 | 	public void setId(Long id) {
  74 | 		this.id = id;
  75 | 	}
  76 | 
  77 | 	public LocalDateTime getCreatedAt() {
  78 | 		return createdAt;
  79 | 	}
  80 | 
  81 | 	public void setCreatedAt(LocalDateTime createdAt) {
  82 | 		this.createdAt = createdAt;
  83 | 	}
  84 | 
  85 | 	public LocalDateTime getLastReviewedAt() {
  86 | 		return lastReviewedAt;
  87 | 	}
  88 | 
  89 | 	public void setLastReviewedAt(LocalDateTime lastReviewedAt) {
  90 | 		this.lastReviewedAt = lastReviewedAt;
  91 | 	}
  92 | 
  93 | 	public DeckEntity getDeckEntity() {
  94 | 		return deckEntity;
  95 | 	}
  96 | 
  97 | 	public void setDeckEntity(DeckEntity deckEntity) {
  98 | 		this.deckEntity = deckEntity;
  99 | 	}
 100 | 
 101 | 	public String getFlashcardType() {
 102 | 		return flashcardType;
 103 | 	}
 104 | 
 105 | 	public void setFlashcardType(String flashcardType) {
 106 | 		this.flashcardType = flashcardType;
 107 | 	}
 108 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/entity/NoteEntity.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.entity;
   2 | 
   3 | import java.time.LocalDateTime;
   4 | import java.util.ArrayList;
   5 | import java.util.List;
   6 | import java.util.Objects;
   7 | 
   8 | import org.springframework.beans.BeanUtils;
   9 | import org.springframework.data.annotation.CreatedDate;
  10 | import org.springframework.data.annotation.LastModifiedDate;
  11 | import org.springframework.data.jpa.domain.support.AuditingEntityListener;
  12 | 
  13 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteDTO;
  14 | import jakarta.persistence.CascadeType; // Import CascadeType
  15 | import jakarta.persistence.Column;
  16 | import jakarta.persistence.Entity;
  17 | import jakarta.persistence.EntityListeners;
  18 | import jakarta.persistence.GeneratedValue;
  19 | import jakarta.persistence.GenerationType;
  20 | import jakarta.persistence.Id;
  21 | import jakarta.persistence.JoinColumn;
  22 | import jakarta.persistence.Lob;
  23 | import jakarta.persistence.ManyToOne;
  24 | import jakarta.persistence.OneToMany; // Import OneToMany
  25 | import jakarta.persistence.Table;
  26 | 
  27 | @Entity
  28 | @Table(name = "tb_note")
  29 | @EntityListeners(AuditingEntityListener.class)
  30 | public class NoteEntity {
  31 | 
  32 | 	@Id
  33 | 	@GeneratedValue(strategy = GenerationType.IDENTITY)
  34 | 	private Long id;
  35 | 
  36 | 	@Column(nullable = false)
  37 | 	private String title;
  38 | 
  39 | 	@Column
  40 | 	private String subtitle;
  41 | 
  42 | 	@Lob
  43 | 	@Column
  44 | 	private String content;
  45 | 
  46 | 	@CreatedDate
  47 | 	@Column(nullable=false, updatable = false)
  48 | 	private LocalDateTime createdAt;
  49 | 
  50 | 	@LastModifiedDate
  51 | 	@Column
  52 | 	private LocalDateTime updatedAt;
  53 | 
  54 | 	@ManyToOne
  55 | 	@JoinColumn(name="user_id")
  56 | 	private UserEntity userEntity;
  57 | 
  58 | 	@OneToMany(mappedBy = "noteEntity", cascade = CascadeType.ALL, orphanRemoval = true)
  59 | 	private List<SourceEntity> sources = new ArrayList<>();
  60 | 
  61 | 
  62 | 	public NoteEntity(NoteDTO note) {
  63 | 		BeanUtils.copyProperties(note, this);
  64 | 	}
  65 | 
  66 | 	public NoteEntity() {
  67 | 
  68 | 	}
  69 | 
  70 | 	@Override
  71 | 	public int hashCode() {
  72 | 		return Objects.hash(id);
  73 | 	}
  74 | 
  75 | 	@Override
  76 | 	public boolean equals(Object obj) {
  77 | 		if (this == obj)
  78 | 			return true;
  79 | 		if (obj == null)
  80 | 			return false;
  81 | 		if (getClass() != obj.getClass())
  82 | 			return false;
  83 | 		NoteEntity other = (NoteEntity) obj;
  84 | 		return Objects.equals(id, other.id);
  85 | 	}
  86 | 
  87 | 	public Long getId() {
  88 | 		return id;
  89 | 	}
  90 | 
  91 | 	public void setId(Long id) {
  92 | 		this.id = id;
  93 | 	}
  94 | 
  95 | 	public String getTitle() {
  96 | 		return title;
  97 | 	}
  98 | 
  99 | 	public void setTitle(String title) {
 100 | 		this.title = title;
 101 | 	}
 102 | 
 103 | 	public String getSubtitle() {
 104 | 		return subtitle;
 105 | 	}
 106 | 
 107 | 	public void setSubtitle(String subtitle) {
 108 | 		this.subtitle = subtitle;
 109 | 	}
 110 | 
 111 | 
 112 | 	public String getContent() {
 113 | 		return content;
 114 | 	}
 115 | 
 116 | 	public void setContent(String content) {
 117 | 		this.content = content;
 118 | 	}
 119 | 
 120 | 	public LocalDateTime getCreatedAt() {
 121 | 		return createdAt;
 122 | 	}
 123 | 
 124 | 	public void setCreatedAt(LocalDateTime createdAt) {
 125 | 		this.createdAt = createdAt;
 126 | 	}
 127 | 
 128 | 	public LocalDateTime getUpdatedAt() {
 129 | 		return updatedAt;
 130 | 	}
 131 | 
 132 | 	public void setUpdatedAt(LocalDateTime updatedAt) {
 133 | 		this.updatedAt = updatedAt;
 134 | 	}
 135 | 
 136 | 	public UserEntity getUserEntity() {
 137 | 		return userEntity;
 138 | 	}
 139 | 
 140 | 	public void setUserEntity(UserEntity userEntity) {
 141 | 		this.userEntity = userEntity;
 142 | 	}
 143 | 
 144 | 	public List<SourceEntity> getSources() {
 145 | 		return sources;
 146 | 	}
 147 | 
 148 | 	public void setSources(List<SourceEntity> sources) {
 149 | 		this.sources = sources;
 150 | 	}
 151 | 
 152 | 	public void addSource(SourceEntity source) {
 153 | 		sources.add(source);
 154 | 		source.setNoteEntity(this);
 155 | 	}
 156 | 
 157 | 	public void removeSource(SourceEntity source) {
 158 | 		sources.remove(source);
 159 | 		source.setNoteEntity(null);
 160 | 	}
 161 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/entity/SourceEntity.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.entity;
   2 | 
   3 | import jakarta.persistence.*;
   4 | import org.springframework.data.annotation.CreatedDate;
   5 | import org.springframework.data.jpa.domain.support.AuditingEntityListener;
   6 | 
   7 | import java.time.LocalDateTime;
   8 | import java.util.Objects;
   9 | 
  10 | @Entity
  11 | @Table(name = "tb_source")
  12 | @EntityListeners(AuditingEntityListener.class)
  13 | public class SourceEntity {
  14 | 
  15 |     @Id
  16 |     @GeneratedValue(strategy = GenerationType.IDENTITY)
  17 |     private Long id;
  18 | 
  19 |     @Column(nullable = false)
  20 |     private String fileName;
  21 | 
  22 |     // Caminho para o arquivo (não o conteúdo)
  23 |     @Column(nullable = false)
  24 |     private String filePath;
  25 | 
  26 |     @CreatedDate
  27 |     @Column(nullable = false, updatable = false)
  28 |     private LocalDateTime createdAt;
  29 | 
  30 |     @ManyToOne(fetch = FetchType.LAZY)
  31 |     @JoinColumn(name = "note_id", nullable = false)
  32 |     private NoteEntity noteEntity;
  33 | 
  34 |     // Construtores
  35 |     public SourceEntity() {
  36 |     }
  37 | 
  38 |     public SourceEntity(String fileName, String filePath, NoteEntity noteEntity) {
  39 |         this.fileName = fileName;
  40 |         this.filePath = filePath;
  41 |         this.noteEntity = noteEntity;
  42 |     }
  43 | 
  44 |     // Getters and Setters
  45 |     public Long getId() {
  46 |         return id;
  47 |     }
  48 | 
  49 |     public void setId(Long id) {
  50 |         this.id = id;
  51 |     }
  52 | 
  53 |     public String getFileName() {
  54 |         return fileName;
  55 |     }
  56 | 
  57 |     public void setFileName(String fileName) {
  58 |         this.fileName = fileName;
  59 |     }
  60 | 
  61 |     public String getFilePath() {
  62 |         return filePath;
  63 |     }
  64 | 
  65 |     public void setFilePath(String filePath) {
  66 |         this.filePath = filePath;
  67 |     }
  68 | 
  69 |     public LocalDateTime getCreatedAt() {
  70 |         return createdAt;
  71 |     }
  72 | 
  73 |     public void setCreatedAt(LocalDateTime createdAt) {
  74 |         this.createdAt = createdAt;
  75 |     }
  76 | 
  77 |     public NoteEntity getNoteEntity() {
  78 |         return noteEntity;
  79 |     }
  80 | 
  81 |     public void setNoteEntity(NoteEntity noteEntity) {
  82 |         this.noteEntity = noteEntity;
  83 |     }
  84 | 
  85 |     @Override
  86 |     public boolean equals(Object o) {
  87 |         if (this == o) return true;
  88 |         if (o == null || getClass() != o.getClass()) return false;
  89 |         SourceEntity that = (SourceEntity) o;
  90 |         return Objects.equals(id, that.id);
  91 |     }
  92 | 
  93 |     @Override
  94 |     public int hashCode() {
  95 |         return Objects.hash(id);
  96 |     }
  97 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/entity/UserEntity.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.entity;
   2 | 
   3 | import java.util.Collection;
   4 | import java.util.List;
   5 | import java.util.Objects;
   6 | 
   7 | import org.springframework.security.core.GrantedAuthority;
   8 | import org.springframework.security.core.authority.SimpleGrantedAuthority;
   9 | import org.springframework.security.core.userdetails.UserDetails;
  10 | 
  11 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserDTO;
  12 | import jakarta.persistence.Column;
  13 | import jakarta.persistence.Entity;
  14 | import jakarta.persistence.GeneratedValue;
  15 | import jakarta.persistence.GenerationType;
  16 | import jakarta.persistence.Id;
  17 | import jakarta.persistence.Table;
  18 | 
  19 | @Entity
  20 | @Table(name = "tb_user")
  21 | public class UserEntity implements UserDetails{
  22 | 	
  23 | 	@Id
  24 | 	@GeneratedValue(strategy = GenerationType.IDENTITY)
  25 | 	private Long id;
  26 | 	
  27 | 	@Column(nullable = false)
  28 | 	private String fullName;
  29 | 
  30 | 	@Column(nullable = false)
  31 | 	private String username;
  32 | 	
  33 | 	@Column(nullable = false, unique = true)
  34 | 	private String email;
  35 | 	
  36 | 	@Column(nullable = false)
  37 | 	private String password;
  38 | 	
  39 | 	public UserEntity(UserDTO user) {
  40 | 		this.id = user.getId();
  41 | 		this.username = user.getUsername();
  42 | 		this.fullName = user.getFullName();
  43 | 		this.email = user.getEmail();
  44 | 	}
  45 | 	
  46 | 	public UserEntity() {
  47 | 		
  48 | 	}
  49 | 	
  50 | 	public UserEntity(String email, String username, String fullName, String password) {
  51 | 		this.email = email;
  52 | 		this.username = username;
  53 | 		this.fullName = fullName;
  54 | 		this.password = password;
  55 | 	}
  56 | 	
  57 | 	public UserEntity(Long id) {
  58 | 		this.id = id;
  59 | 	}
  60 | 	
  61 | 	@Override
  62 | 	public int hashCode() {
  63 | 		return Objects.hash(id);
  64 | 	}
  65 | 
  66 | 	@Override
  67 | 	public boolean equals(Object obj) {
  68 | 		if (this == obj)
  69 | 			return true;
  70 | 		if (obj == null)
  71 | 			return false;
  72 | 		if (getClass() != obj.getClass())
  73 | 			return false;
  74 | 		UserEntity other = (UserEntity) obj;
  75 | 		return Objects.equals(id, other.id);
  76 | 	}
  77 | 
  78 | 	public Long getId() {
  79 | 		return id;
  80 | 	}
  81 | 
  82 | 	public void setId(Long id) {
  83 | 		this.id = id;
  84 | 	}
  85 | 
  86 | 	public String getFullName() {
  87 | 		return fullName;
  88 | 	}
  89 | 
  90 | 	public void setFullName(String fullName) {
  91 | 		this.fullName = fullName;
  92 | 	}
  93 | 
  94 | 	public String getUserName() {
  95 | 		return username;
  96 | 	}
  97 | 
  98 | 	public void setUsername(String username) {
  99 | 		this.username = username;
 100 | 	}
 101 | 
 102 | 	public String getEmail() {
 103 | 		return email;
 104 | 	}
 105 | 
 106 | 	public void setEmail(String email) {
 107 | 		this.email = email;
 108 | 	}
 109 | 
 110 | 	public String getPassword() {
 111 | 		return password;
 112 | 	}
 113 | 
 114 | 	public void setPassword(String password) {
 115 | 		this.password = password;
 116 | 	}
 117 | 
 118 | 	@Override
 119 | 	public Collection<? extends GrantedAuthority> getAuthorities() {
 120 | 		return List.of(new SimpleGrantedAuthority("ROLE_USER"));
 121 | 	}
 122 | 
 123 | 	@Override
 124 | 	public String getUsername() {
 125 | 		return email;
 126 | 	}
 127 | 	
 128 | 	 @Override
 129 | 	 public boolean isAccountNonExpired() {
 130 | 		 return true;
 131 | 	 }
 132 | 
 133 | 	 @Override
 134 | 	 public boolean isAccountNonLocked() {
 135 | 	     return true;
 136 | 	 }
 137 | 
 138 | 	 @Override
 139 | 	 public boolean isCredentialsNonExpired() {
 140 | 		 return true;
 141 |      }
 142 | 
 143 | 	 @Override
 144 | 	 public boolean isEnabled() {
 145 | 	     return true;
 146 | 	 }
 147 | 
 148 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/AuthenticationFailureException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class AuthenticationFailureException extends RuntimeException {
   4 |   public AuthenticationFailureException(String message) {
   5 |     super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/FileStorageException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class FileStorageException extends RuntimeException {
   4 |   public FileStorageException(String message) {
   5 |     super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/GlobalExceptionHandler.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | import java.util.HashMap;
   4 | import java.util.Map;
   5 | 
   6 | import org.springframework.http.HttpStatus;
   7 | import org.springframework.http.MediaType;
   8 | import org.springframework.http.ResponseEntity;
   9 | import org.springframework.web.bind.annotation.ExceptionHandler;
  10 | import org.springframework.web.bind.annotation.RestControllerAdvice;
  11 | 
  12 | @RestControllerAdvice
  13 | public class GlobalExceptionHandler {
  14 |   
  15 |   @ExceptionHandler(ObjectNotFoundException.class)
  16 |   public ResponseEntity<Map<String, String>> handleObjectNotFound(ObjectNotFoundException exception) {
  17 |     Map<String, String> error = new HashMap<>();
  18 |     error.put("message", exception.getMessage());
  19 |     return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
  20 |   }
  21 | 
  22 |   @ExceptionHandler(InvalidObjectDataException.class)
  23 |   public ResponseEntity<Map<String, String>> handleInvalidObjectData(InvalidObjectDataException exception) {
  24 |     Map<String, String> error = new HashMap<>();
  25 |     error.put("message", exception.getMessage());
  26 |     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
  27 |   }
  28 | 
  29 |   @ExceptionHandler(UnauthorizedObjectAccessException.class)
  30 |   public ResponseEntity<Map<String, String>> handleObjectFlashcardAccess(UnauthorizedObjectAccessException exception) {
  31 |     Map<String, String> error = new HashMap<>();
  32 |     error.put("message", exception.getMessage());
  33 |     return ResponseEntity.status(HttpStatus.FORBIDDEN).body(error);
  34 |   }
  35 | 
  36 |   @ExceptionHandler(UnexpectedResponseException.class)
  37 |   public ResponseEntity<Map<String, String>> handleUnexpectedResponse(UnexpectedResponseException exception) {
  38 |     Map<String, String> error = new HashMap<>();
  39 |     error.put("message", exception.getMessage());
  40 |     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
  41 |   }
  42 | 
  43 |   @ExceptionHandler(FileStorageException.class)
  44 |   public ResponseEntity<Map<String, String>> handleFileStorage(FileStorageException exception) {
  45 |     Map<String, String> error = new HashMap<>();
  46 |     error.put("message", exception.getMessage());
  47 |     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
  48 |   }
  49 | 
  50 |   @ExceptionHandler(StorageInitializationException.class)
  51 |   public ResponseEntity<Map<String, String>> handleStorageInitialization(StorageInitializationException exception) {
  52 |     Map<String, String> error = new HashMap<>();
  53 |     error.put("message", exception.getMessage());
  54 |     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
  55 |   }
  56 | 
  57 |   @ExceptionHandler(ObjectDeletionException.class)
  58 |   public ResponseEntity<Map<String, String>> handleObjectDeletion(ObjectDeletionException exception) {
  59 |     Map<String, String> error = new HashMap<>();
  60 |     error.put("message", exception.getMessage());
  61 |     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
  62 |   }
  63 | 
  64 |   @ExceptionHandler(IncorrectPasswordException.class)
  65 |   public ResponseEntity<Map<String, String>> handleIncorrectPassword(IncorrectPasswordException exception) {
  66 |     Map<String, String> error = new HashMap<>();
  67 |     error.put("message", exception.getMessage());
  68 |     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
  69 |   }
  70 | 
  71 |   @ExceptionHandler(PasswordMismatchException.class)
  72 |   public ResponseEntity<Map<String, String>> handlePasswordMismatch(PasswordMismatchException exception) {
  73 |     Map<String, String> error = new HashMap<>();
  74 |     error.put("message", exception.getMessage());
  75 |     return ResponseEntity.status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(error);
  76 |   }
  77 | 
  78 |   @ExceptionHandler(AuthenticationFailureException.class)
  79 |   public ResponseEntity<Map<String, String>> handleAuthenticationFailure(AuthenticationFailureException exception) {
  80 |     Map<String, String> error = new HashMap<>();
  81 |     error.put("message", exception.getMessage());
  82 |     return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(error);
  83 |   }
  84 | 
  85 |   @ExceptionHandler(UnexpectedFailureException.class)
  86 |   public ResponseEntity<Map<String, String>> handleUnexpectedFailure(UnexpectedFailureException exception) {
  87 |     Map<String, String> error = new HashMap<>();
  88 |     error.put("message", exception.getMessage());
  89 |     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
  90 |   }
  91 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/IncorrectPasswordException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class IncorrectPasswordException extends RuntimeException {
   4 |   public IncorrectPasswordException(String message) {
   5 |     super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/InvalidObjectDataException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class InvalidObjectDataException extends RuntimeException {
   4 |   public InvalidObjectDataException(String message) {
   5 |     super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/ObjectDeletionException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class ObjectDeletionException extends RuntimeException {
   4 |   public ObjectDeletionException(String message) {
   5 |     super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/ObjectNotFoundException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class ObjectNotFoundException extends RuntimeException {
   4 |   public ObjectNotFoundException(String message) {
   5 |     super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/PasswordMismatchException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class PasswordMismatchException extends RuntimeException {
   4 |   public PasswordMismatchException(String message) {
   5 |     super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/StorageInitializationException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class StorageInitializationException extends RuntimeException {
   4 |   public StorageInitializationException(String message) {
   5 |       super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/UnauthorizedObjectAccessException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class UnauthorizedObjectAccessException extends RuntimeException {
   4 |   public UnauthorizedObjectAccessException(String message) {
   5 |     super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/UnexpectedFailureException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class UnexpectedFailureException extends RuntimeException {
   4 |   public UnexpectedFailureException(String message) {
   5 |     super(message);
   6 |   }
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/exception/UnexpectedResponseException.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.exception;
   2 | 
   3 | public class UnexpectedResponseException extends RuntimeException {
   4 |   public UnexpectedResponseException(String message) {
   5 |     super(message);
   6 |   } 
   7 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/handler/FlashcardTypeHandler.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.handler;
   2 | 
   3 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
   4 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserAnswerDTO;
   5 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
   6 | 
   7 | public interface FlashcardTypeHandler<D extends FlashcardDTO, E extends FlashcardEntity, U extends UserAnswerDTO> {
   8 |   String supportsType(); // Retorna o  tipo de flashcard que este handler consegue processar
   9 |   E createFlashcard(D dto);
  10 |   void updateFlashcard(E flashcard, D dto);
  11 |   int evaluateAnswer(E flashcard, U answer);
  12 |   D entityToDTO(E flashcard);
  13 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/handler/FlashcardTypeHandlerRegistry.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.handler;
   2 | 
   3 | import java.util.List;
   4 | import java.util.Map;
   5 | import java.util.function.Function;
   6 | import java.util.stream.Collectors;
   7 | 
   8 | import org.springframework.stereotype.Component;
   9 | 
  10 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
  11 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserAnswerDTO;
  12 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
  13 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
  14 | 
  15 | @Component
  16 | public class FlashcardTypeHandlerRegistry {
  17 |   private Map<String, FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO>> handlersMap;
  18 | 
  19 |   public FlashcardTypeHandlerRegistry(List<FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO>> handlers) {
  20 |     this.handlersMap = handlers.stream().collect(Collectors.toMap(FlashcardTypeHandler::supportsType, Function.identity()));
  21 |   }
  22 | 
  23 |   public FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> getHandler(String type) {
  24 |     FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlersMap.get(type);
  25 |     if (handler == null) {
  26 |         throw new InvalidObjectDataException(
  27 |             "No handler found for flashcard type: '" + type + "'. " +
  28 |             "Please ensure an implementation of FlashcardTypeHandler " +
  29 |             "for this type is provided by your application and is discoverable by Spring."
  30 |         );
  31 |     }
  32 |     return handler;
  33 |   }
  34 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/handler/FlashcardTypeSearchHandler.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.handler;
   2 | 
   3 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
   4 | import jakarta.persistence.criteria.CriteriaBuilder;
   5 | import jakarta.persistence.criteria.Predicate;
   6 | import jakarta.persistence.criteria.Root;
   7 | 
   8 | public interface FlashcardTypeSearchHandler {
   9 |   String supportsType(); // Retorna o  tipo de flashcard que este handler consegue processar
  10 |   
  11 |   /**
  12 |    * Cria uma Predicate para a busca por palavra-chave, específica para este tipo de Flashcard.
  13 |    *
  14 |    * @param root A Root<FlashcardEntity> para a consulta atual.
  15 |    * @param criteriaBuilder O CriteriaBuilder.
  16 |    * @param lowerCaseWordPattern O padrão de palavra a ser buscado (já em minúsculas e com wildcards).
  17 |    * @return Uma Predicate que representa a condição de busca para este tipo, ou null se nenhuma condição se aplicar.
  18 |    */
  19 |   Predicate getWordSearchPredicate(Root<FlashcardEntity> root, CriteriaBuilder criteriaBuilder, String word);
  20 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/handler/FlashcardTypeSearchRegistry.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.handler;
   2 | 
   3 | import java.util.HashMap;
   4 | import java.util.List;
   5 | import java.util.Map;
   6 | import java.util.Optional;
   7 | 
   8 | import org.springframework.stereotype.Component;
   9 | 
  10 | import jakarta.annotation.PostConstruct;
  11 | 
  12 | @Component
  13 | public class FlashcardTypeSearchRegistry {
  14 |   private final Map<String, FlashcardTypeSearchHandler> handlers = new HashMap<>();
  15 |   // O Spring injetará automaticamente uma lista de todos os beans que implementam FlashcardTypeSearchHandler
  16 |   private final List<FlashcardTypeSearchHandler> injectedHandlers;
  17 |   
  18 |   public FlashcardTypeSearchRegistry(List<FlashcardTypeSearchHandler> injectedHandlers) {
  19 |       this.injectedHandlers = injectedHandlers;
  20 |   }
  21 | 
  22 |   @PostConstruct // Este método é executado após a injeção de dependências
  23 |   public void init() {
  24 |       for (FlashcardTypeSearchHandler handler : injectedHandlers) {
  25 |           handlers.put(handler.supportsType(), handler);
  26 |       }
  27 |   }
  28 | 
  29 |   /**
  30 |    * Recupera o handler de busca para um determinado tipo de flashcard.
  31 |    *
  32 |    * @param type A string do tipo de flashcard.
  33 |    * @return Um Optional contendo o handler se encontrado, ou vazio caso contrário.
  34 |    */
  35 |   public Optional<FlashcardTypeSearchHandler> getHandler(String type) {
  36 |       return Optional.ofNullable(handlers.get(type));
  37 |   }
  38 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/infra/provider/AiProviderConfig.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.infra.provider;
   2 | 
   3 | import org.springframework.ai.anthropic.AnthropicChatModel;
   4 | import org.springframework.ai.chat.client.ChatClient;
   5 | import org.springframework.ai.openai.OpenAiChatModel;
   6 | import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
   7 | import org.springframework.context.annotation.Bean;
   8 | import org.springframework.context.annotation.Configuration;
   9 | import org.springframework.context.annotation.Primary;
  10 | 
  11 | @Configuration
  12 | public class AiProviderConfig {
  13 | 
  14 |     @Bean
  15 |     @Primary
  16 |     public ChatClient openAiChatClient(OpenAiChatModel openAiChatModel) { 
  17 |         // OBS: Funciona com qualquer API compatível com a da OpenAI (incluindo a do Gemini que é bem mais fácil de usar dessa forma do que via vertex)
  18 |         return ChatClient.create(openAiChatModel);
  19 |     }
  20 | 
  21 |     @Bean
  22 |     public ChatClient anthropicChatClient(AnthropicChatModel anthropicChatModel) {
  23 |         return ChatClient.create(anthropicChatModel);
  24 |     }
  25 | 
  26 |     @Bean
  27 |     public ChatClient vertexAiChatClient(VertexAiGeminiChatModel vertexAiGeminiChatModel) {
  28 |         return ChatClient.create(vertexAiGeminiChatModel);
  29 |     }
  30 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/infra/security/CorsConfig.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.infra.security;
   2 | 
   3 | import org.springframework.context.annotation.Bean;
   4 | import org.springframework.context.annotation.Configuration;
   5 | import org.springframework.web.servlet.config.annotation.CorsRegistry;
   6 | import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
   7 | 
   8 | @Configuration
   9 | public class CorsConfig {
  10 |     @Bean
  11 |     public WebMvcConfigurer corsConfigurer() {
  12 |         return new WebMvcConfigurer() {
  13 |             @Override
  14 |             public void addCorsMappings(CorsRegistry registry) {
  15 |                 registry.addMapping("/**")
  16 |                         .allowedOrigins("http://localhost:5173")
  17 |                         .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
  18 |                         .allowedHeaders("*");
  19 |             }
  20 |         };
  21 |     }
  22 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/infra/security/SecurityConfiguration.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.infra.security;
   2 | 
   3 | 
   4 | import org.springframework.beans.factory.annotation.Autowired;
   5 | import org.springframework.context.annotation.Bean;
   6 | import org.springframework.context.annotation.Configuration;
   7 | import org.springframework.http.HttpMethod;
   8 | import org.springframework.security.authentication.AuthenticationManager;
   9 | import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
  10 | import org.springframework.security.config.Customizer;
  11 | import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
  12 | import org.springframework.security.config.annotation.web.builders.HttpSecurity;
  13 | import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
  14 | import org.springframework.security.config.http.SessionCreationPolicy;
  15 | import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
  16 | import org.springframework.security.crypto.password.PasswordEncoder;
  17 | import org.springframework.security.web.SecurityFilterChain;
  18 | import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
  19 | 
  20 | import br.com.TrabalhoEngSoftwareFramework.framework.service.AuthorizationService;
  21 | 
  22 | @Configuration
  23 | @EnableWebSecurity
  24 | public class SecurityConfiguration {
  25 | 	
  26 | 	@Autowired
  27 | 	SecurityFilter securityFilter;
  28 | 	
  29 | 	@Bean
  30 | 	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
  31 | 		return httpSecurity
  32 | 				.csrf(csrf -> csrf.disable())
  33 | 				.cors(Customizer.withDefaults())
  34 | //				.cors(cors -> cors.configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues()))
  35 | 				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
  36 | 				.authorizeHttpRequests(authorize -> authorize
  37 | 		                .requestMatchers(HttpMethod.POST, "/auth/register", "/auth/login").permitAll()
  38 | 										.requestMatchers(HttpMethod.GET, "/api/**").authenticated()
  39 |     								.requestMatchers(HttpMethod.POST, "/api/**").authenticated()
  40 |     								.requestMatchers(HttpMethod.PUT, "/api/**").authenticated()   // ✅ isso aqui resolve
  41 |     								.requestMatchers(HttpMethod.DELETE, "/api/**").authenticated()
  42 | 						.anyRequest().authenticated()
  43 | 				)
  44 | 				.authenticationProvider(authenticationProvider())
  45 | 				.addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
  46 | 				.build();
  47 | 	}
  48 | 	
  49 | 	@Bean
  50 | 	public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
  51 | 	    return configuration.getAuthenticationManager();
  52 | 	}
  53 | 
  54 | 	
  55 | 	@Bean
  56 | 	public PasswordEncoder passwordEncoder() {
  57 | 		return new BCryptPasswordEncoder();
  58 | 	}
  59 | 	
  60 | 	@Autowired
  61 | 	AuthorizationService authorizationService;
  62 | 
  63 | 	@Bean
  64 | 	public DaoAuthenticationProvider authenticationProvider() {
  65 | 	    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
  66 | 	    authProvider.setUserDetailsService(authorizationService);
  67 | 	    authProvider.setPasswordEncoder(passwordEncoder());
  68 | 	    return authProvider;
  69 | 	}
  70 | 
  71 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/infra/security/SecurityFilter.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.infra.security;
   2 | 
   3 | import java.io.IOException;
   4 | 
   5 | import org.springframework.beans.factory.annotation.Autowired;
   6 | import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
   7 | import org.springframework.security.core.context.SecurityContextHolder;
   8 | import org.springframework.security.core.userdetails.UserDetails;
   9 | import org.springframework.stereotype.Component;
  10 | import org.springframework.web.filter.OncePerRequestFilter;
  11 | 
  12 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.UserRepository;
  13 | import jakarta.servlet.FilterChain;
  14 | import jakarta.servlet.ServletException;
  15 | import jakarta.servlet.http.HttpServletRequest;
  16 | import jakarta.servlet.http.HttpServletResponse;
  17 | 
  18 | @Component
  19 | public class SecurityFilter extends OncePerRequestFilter {
  20 | 
  21 | 	@Autowired
  22 | 	TokenService tokenService;
  23 | 	
  24 | 	@Autowired
  25 | 	UserRepository userRepository;
  26 | 	
  27 | 	@Override
  28 | 	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
  29 | 			throws ServletException, IOException {
  30 | 		var token = this.recoverToken(request);
  31 | 		if(token != null) {
  32 | 			var email = tokenService.validateToken(token);
  33 | 			UserDetails user = userRepository.findByEmail(email);
  34 | 			
  35 | 			var authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
  36 | 			SecurityContextHolder.getContext().setAuthentication(authentication);
  37 | 		}
  38 | 		filterChain.doFilter(request, response);
  39 | 	}
  40 | 	
  41 | 	private String recoverToken(HttpServletRequest request) {
  42 | 		var authHeader = request.getHeader("Authorization");
  43 | 		if(authHeader == null) return null;
  44 | 		return authHeader.replace("Bearer ", "");
  45 | 	}
  46 | 	
  47 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/infra/security/TokenService.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.infra.security;
   2 | 
   3 | import java.time.Instant;
   4 | import java.time.LocalDateTime;
   5 | import java.time.ZoneOffset;
   6 | 
   7 | import org.springframework.beans.factory.annotation.Value;
   8 | import org.springframework.stereotype.Service;
   9 | 
  10 | import com.auth0.jwt.JWT;
  11 | import com.auth0.jwt.algorithms.Algorithm;
  12 | import com.auth0.jwt.exceptions.JWTCreationException;
  13 | import com.auth0.jwt.exceptions.JWTVerificationException;
  14 | 
  15 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  16 | 
  17 | @Service
  18 | public class TokenService {
  19 | 	
  20 | 	@Value("${api.security.token.secret}")
  21 | 	private String secret;
  22 | 	
  23 | 	public String generateToken(UserEntity userEntity) {
  24 | 		try {
  25 | 			Algorithm algorithm = Algorithm.HMAC256(secret);
  26 | 			String token = JWT.create()
  27 | 					.withIssuer("auth-api")
  28 | 					.withSubject(userEntity.getEmail())
  29 | 					.withExpiresAt(genExpirationDate())
  30 | 					.sign(algorithm);
  31 | 			return token;
  32 | 		} catch (JWTCreationException exception) {
  33 | 			throw new RuntimeException("Error while generating token", exception);
  34 | 		}
  35 | 	}
  36 | 	
  37 | 	public String validateToken(String token) {
  38 | 		try {
  39 | 			Algorithm algorithm = Algorithm.HMAC256(secret);
  40 | 			return JWT.require(algorithm)
  41 | 					.withIssuer("auth-api")
  42 | 					.build()
  43 | 					.verify(token)
  44 | 					.getSubject();
  45 | 		} catch(JWTVerificationException exception) {
  46 | 			return "";
  47 | 		}
  48 | 	}
  49 | 	
  50 | 	private Instant genExpirationDate() {
  51 | 		return LocalDateTime.now().plusHours(24).toInstant(ZoneOffset.of("-03:00"));
  52 | 	}
  53 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/repository/DeckRepository.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.repository;
   2 | 
   3 | import org.springframework.data.jpa.repository.JpaRepository;
   4 | import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
   5 | 
   6 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.DeckEntity;
   7 | 
   8 | public interface DeckRepository extends JpaRepository<DeckEntity, Long>, JpaSpecificationExecutor<DeckEntity>{
   9 |   void deleteByUserEntityId(Long userId);
  10 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/repository/FlashcardRepository.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.repository;
   2 | 
   3 | import org.springframework.data.jpa.repository.JpaRepository;
   4 | import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
   5 | 
   6 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
   7 | 
   8 | public interface FlashcardRepository extends JpaRepository<FlashcardEntity, Long>, JpaSpecificationExecutor<FlashcardEntity>{
   9 |   
  10 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/repository/NoteRepository.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.repository;
   2 | 
   3 | import org.springframework.data.jpa.repository.JpaRepository;
   4 | import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
   5 | 
   6 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;
   7 | 
   8 | public interface NoteRepository extends JpaRepository<NoteEntity, Long>, JpaSpecificationExecutor<NoteEntity>{
   9 |   void deleteByUserEntityId(Long userId);
  10 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/repository/SourceRepository.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.repository;
   2 | 
   3 | import org.springframework.data.jpa.repository.JpaRepository;
   4 | 
   5 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.SourceEntity;
   6 | 
   7 | import java.util.List;
   8 | 
   9 | public interface SourceRepository extends JpaRepository<SourceEntity, Long> {
  10 |     // Encontra todas os arquivos associados ao ID especificado
  11 |     List<SourceEntity> findByNoteEntityId(Long noteId);
  12 | 
  13 |     // Encontra um arquivo específico associado ao ID do arquivo e ao ID da nota (para confirmar que o arquivo pertence à nota)
  14 |     SourceEntity findByIdAndNoteEntityId(Long sourceId, Long noteId);
  15 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/repository/UserRepository.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.repository;
   2 | 
   3 | import org.springframework.data.jpa.repository.JpaRepository;
   4 | import org.springframework.security.core.userdetails.UserDetails;
   5 | 
   6 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
   7 | 
   8 | public interface UserRepository extends JpaRepository<UserEntity, Long> {
   9 | 	UserDetails findByEmail(String email); 
  10 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/AiService.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service;
   2 | 
   3 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
   4 | import br.com.TrabalhoEngSoftwareFramework.framework.service.provider.AiProvider;
   5 | import br.com.TrabalhoEngSoftwareFramework.framework.service.prompt.PromptBuilder;
   6 | import org.springframework.ai.chat.client.ChatClient;
   7 | import org.springframework.ai.chat.prompt.Prompt;
   8 | import org.springframework.beans.factory.ObjectProvider;
   9 | import org.springframework.stereotype.Service;
  10 | 
  11 | import reactor.core.publisher.Flux;
  12 | 
  13 | import java.util.List;
  14 | import java.util.Map;
  15 | 
  16 | @Service
  17 | public class AiService {
  18 | 
  19 |     private final AiProvider aiProvider;
  20 |     private final ObjectProvider<PromptBuilder> promptBuilderProvider;
  21 |     private final Map<String, ChatClient> chatClients;
  22 | 
  23 |     public AiService(AiProvider aiProvider, ObjectProvider<PromptBuilder> promptBuilderProvider, Map<String, ChatClient> chatClients) {
  24 |         this.aiProvider = aiProvider;
  25 |         this.promptBuilderProvider = promptBuilderProvider;
  26 |         this.chatClients = chatClients;
  27 |     }
  28 | 
  29 |     public String getCompletion(String systemPrompt, String userPrompt, Long noteId, List<Long> sourceIds, Long userId, String provider) {
  30 |         ChatClient chatClient = chatClients.get(provider);
  31 |         Prompt prompt = promptBuilderProvider.getObject()
  32 |                 .withSystemMessage(systemPrompt)
  33 |                 .withUserMessage(userPrompt)
  34 |                 .withNoteContext(noteId, userId)
  35 |                 .withSourceContext(sourceIds, noteId, userId)
  36 |                 .build();
  37 |         return aiProvider.getCompletion(prompt, chatClient);
  38 |     }
  39 | 
  40 |     public List<FlashcardDTO> generateFlashcardSuggestions(String noteContent, Long userId, int count, String provider) {
  41 |         ChatClient chatClient = chatClients.get(provider);
  42 |         Prompt prompt = promptBuilderProvider.getObject()
  43 |                 .forFlashcardGeneration(noteContent, count)
  44 |                 .build();
  45 |         return aiProvider.getJsonCompletion(prompt, List.class, chatClient);
  46 |     }
  47 | 
  48 |     public Flux<String> getStreamCompletion(String systemPrompt, String userPrompt, Long noteId, List<Long> sourceIds, Long userId, String provider) {
  49 |         ChatClient chatClient = chatClients.get(provider);
  50 |         Prompt prompt = promptBuilderProvider.getObject()
  51 |                 .withSystemMessage(systemPrompt)
  52 |                 .withUserMessage(userPrompt)
  53 |                 .withNoteContext(noteId, userId)
  54 |                 .withSourceContext(sourceIds, noteId, userId)
  55 |                 .build();
  56 |         return aiProvider.getStreamCompletion(prompt, chatClient);
  57 |     }
  58 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/AuthorizationService.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service;
   2 | 
   3 | import org.springframework.beans.factory.annotation.Autowired;
   4 | import org.springframework.security.core.userdetails.UserDetails;
   5 | import org.springframework.security.core.userdetails.UserDetailsService;
   6 | import org.springframework.security.core.userdetails.UsernameNotFoundException;
   7 | import org.springframework.stereotype.Service;
   8 | 
   9 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.UserRepository;
  10 | 
  11 | @Service
  12 | public class AuthorizationService implements UserDetailsService {
  13 | 	
  14 | 	@Autowired
  15 | 	private UserRepository userRepository;
  16 | 	
  17 | 	@Override
  18 | 	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
  19 | 		return userRepository.findByEmail(username);
  20 | 	}
  21 | 
  22 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/DeckService.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service;
   2 | 
   3 | import org.springframework.beans.factory.annotation.Autowired;
   4 | import org.springframework.data.domain.Page;
   5 | import org.springframework.data.domain.Pageable;
   6 | import org.springframework.data.jpa.domain.Specification;
   7 | import org.springframework.stereotype.Service;
   8 | import org.springframework.transaction.annotation.Transactional;
   9 | 
  10 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.DeckDTO;
  11 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.DeckSummaryDTO;
  12 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.DeckEntity;
  13 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  14 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
  15 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectNotFoundException;
  16 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.UnauthorizedObjectAccessException;
  17 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.DeckRepository;
  18 | import br.com.TrabalhoEngSoftwareFramework.framework.specification.DeckSpecificationBuilder;
  19 | 
  20 | @Service
  21 | public class DeckService {
  22 |   
  23 |   @Autowired
  24 |   protected DeckRepository deckRepository;
  25 | 
  26 |   @Autowired
  27 |   protected TopicService topics;
  28 | 
  29 |   public DeckService (DeckRepository deckRepository) {
  30 |     this.deckRepository = deckRepository;
  31 |   }
  32 | 
  33 |   @Transactional
  34 |   public void createDeck(DeckDTO deckDTO, Long userId) {
  35 |     topics.addTopic(deckDTO.getTopic().trim());
  36 |     DeckEntity deck = new DeckEntity();
  37 |     if(deckDTO.getTitle() == null || deckDTO.getTitle().trim().isEmpty()) {
  38 |       throw new InvalidObjectDataException("Deck title can't be empty");
  39 |     }
  40 |     deck.setTitle(deckDTO.getTitle().trim());
  41 |     deck.setTopic(deckDTO.getTopic().trim());
  42 |     deck.setUserEntity(new UserEntity(userId));
  43 |     deckRepository.save(deck);
  44 |   }
  45 | 
  46 |   public Page<DeckSummaryDTO> listDecks(String title, String topic, Long userId, String sortType, Pageable pageable) {
  47 |     DeckSpecificationBuilder builder = new DeckSpecificationBuilder(title, topic);
  48 |     builder.addSpecification("filterByTitle");
  49 |     builder.addSpecification("filterByTopic");
  50 | 
  51 |     if(sortType != null && !sortType.trim().isEmpty()) {
  52 |       builder.addSpecification(sortType); // Adiciona a ordenação nomeada
  53 |     }
  54 | 
  55 |     Specification<DeckEntity> specification = builder.build(userId, "userEntity");
  56 |     return deckRepository.findAll(specification, pageable).map(DeckSummaryDTO::new);
  57 |   }
  58 | 
  59 |   @Transactional 
  60 |   public DeckSummaryDTO updateDeck(Long deckId, DeckSummaryDTO deckSummaryDTO, Long userId) {
  61 |     DeckEntity deck = deckRepository.findById(deckId).orElseThrow(() -> new ObjectNotFoundException("Deck not found"));
  62 |     
  63 |     topics.updateTopic(deck.getTopic(), deckSummaryDTO.getTopic());
  64 | 
  65 |     if(!deck.getUserEntity().getId().equals(userId)) {
  66 |       throw new UnauthorizedObjectAccessException("Unauthorized to edit this deck");
  67 |     }
  68 |     
  69 |     if(deckSummaryDTO.getTitle() != null) {
  70 |       if(deckSummaryDTO.getTitle().trim().isEmpty()) {
  71 |         throw new InvalidObjectDataException("Title deck can't be empty");
  72 | 			}
  73 | 	    deck.setTitle(deckSummaryDTO.getTitle());
  74 |     }
  75 | 
  76 |     if(deckSummaryDTO.getTopic() != null){
  77 |       deck.setTopic(deckSummaryDTO.getTopic());
  78 |     }
  79 | 
  80 |     return new DeckSummaryDTO(deckRepository.save(deck));
  81 |   }
  82 | 
  83 |   @Transactional
  84 |   public void deleteDeck(Long deckId, Long userId) {
  85 | 		DeckEntity deck = deckRepository.findById(deckId).orElseThrow(() -> new ObjectNotFoundException("Deck not found"));
  86 |     topics.removeTopic(deck.getTopic().trim());
  87 | 		if(!deck.getUserEntity().getId().equals(userId)) {
  88 | 			throw new UnauthorizedObjectAccessException("Unauthorized to delete this deck");
  89 | 		}
  90 | 		deckRepository.delete(deck);
  91 |   }
  92 | 
  93 |   public long getFlashcardsTotal(Long deckId, Long userId) {
  94 |     DeckEntity deck = deckRepository.findById(deckId).orElseThrow(() -> new ObjectNotFoundException("Deck not found"));
  95 |     if(!deck.getUserEntity().getId().equals(userId)) {
  96 | 			throw new UnauthorizedObjectAccessException("Unauthorized to see due flashcards total this deck");
  97 | 		}
  98 |     long flashcardsTotal = deck.getFlashcards().size();
  99 |     return flashcardsTotal;
 100 |   }
 101 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/FlashcardService.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service;
   2 | 
   3 | import java.util.List;
   4 | import java.util.ArrayList;
   5 | 
   6 | import org.springframework.data.domain.Page;
   7 | import org.springframework.beans.factory.annotation.Autowired;
   8 | import org.springframework.data.domain.Pageable;
   9 | import org.springframework.data.jpa.domain.Specification;
  10 | import org.springframework.stereotype.Service;
  11 | import org.springframework.transaction.annotation.Transactional;
  12 | 
  13 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.FlashcardDTO;
  14 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserAnswerDTO;
  15 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.DeckEntity;
  16 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
  17 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
  18 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectNotFoundException;
  19 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.UnauthorizedObjectAccessException;
  20 | import br.com.TrabalhoEngSoftwareFramework.framework.handler.FlashcardTypeHandler;
  21 | import br.com.TrabalhoEngSoftwareFramework.framework.handler.FlashcardTypeHandlerRegistry;
  22 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.DeckRepository;
  23 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.FlashcardRepository;
  24 | import br.com.TrabalhoEngSoftwareFramework.framework.specification.FlashcardSpecificationBuilder;
  25 | 
  26 | @Service
  27 | public class FlashcardService {
  28 |   
  29 |   @Autowired
  30 |   protected FlashcardRepository flashcardRepository;
  31 |   @Autowired
  32 |   protected DeckRepository deckRepository;
  33 |   @Autowired
  34 |   protected FlashcardTypeHandlerRegistry handlerRegistry;
  35 |   @Autowired
  36 |   protected FlashcardSpecificationBuilder flashcardSpecificationBuilder;
  37 | 
  38 |   public FlashcardService() {
  39 | 
  40 |   }
  41 | 
  42 |   @Transactional
  43 |   public void createFlashcard(FlashcardDTO flashcardDTO, Long deckId) {
  44 |     if (flashcardDTO.getFlashcardType() == null || flashcardDTO.getFlashcardType().trim().isEmpty()) {
  45 |       throw new InvalidObjectDataException("Flashcard type is required for create.");
  46 |     }
  47 |     
  48 |     DeckEntity deck = deckRepository.findById(deckId).orElseThrow(() -> new ObjectNotFoundException("Flashcard deck not found"));
  49 |     FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcardDTO.getFlashcardType());
  50 |     
  51 |     FlashcardEntity flashcard = handler.createFlashcard(flashcardDTO);
  52 |     
  53 |     // flashcard.setType(flashcardDTO.getFlashcardType());
  54 |     flashcard.setDeckEntity(deck);
  55 |     
  56 |     flashcard.getDeckEntity().getFlashcards().add(flashcard);
  57 |   }
  58 | 
  59 |   public Page<FlashcardDTO> listFlashcards(String word, String flashcardFilter, Long userId, Long deckId, String sortType, Pageable pageable) {
  60 |     flashcardSpecificationBuilder.addWordFilter(word);
  61 | 
  62 |     if(flashcardFilter != null && !flashcardFilter.trim().isEmpty()) {
  63 |       flashcardSpecificationBuilder.addSpecification(flashcardFilter); // Adiciona o filtro nomeado
  64 |     }
  65 | 
  66 |     if(sortType != null && !sortType.trim().isEmpty()) {
  67 |       flashcardSpecificationBuilder.addSpecification(sortType); // Adiciona a ordenação nomeada
  68 |     }
  69 | 
  70 |     Specification<FlashcardEntity> specification = flashcardSpecificationBuilder.build(deckId, "deckEntity");
  71 |     
  72 |     return flashcardRepository.findAll(specification, pageable).map(flashcardEntity -> {
  73 |       FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcardEntity.getFlashcardType());
  74 |       return handler.entityToDTO(flashcardEntity);
  75 |     });
  76 |   }
  77 | 
  78 |   @Transactional
  79 |   public void updateFlashcard(Long flashcardId, FlashcardDTO flashcardDTO, Long userId) {
  80 |     FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));
  81 | 
  82 |     if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
  83 |       throw new UnauthorizedObjectAccessException("Unauthorized to edit this flashcard");
  84 |     }
  85 | 
  86 |     if (flashcardDTO.getFlashcardType() == null || flashcardDTO.getFlashcardType().trim().isEmpty()) {
  87 |       throw new InvalidObjectDataException("Flashcard type is required for update.");
  88 |     }
  89 | 
  90 |     if (!flashcardDTO.getFlashcardType().equals(flashcard.getFlashcardType())) {
  91 |       throw new InvalidObjectDataException("Cannot change flashcard type during update. Existing type: " + flashcard.getFlashcardType() + ", Provided type: " + flashcardDTO.getFlashcardType());
  92 |     }
  93 | 
  94 |     FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcardDTO.getFlashcardType());
  95 |     handler.updateFlashcard(flashcard, flashcardDTO);
  96 |   }
  97 | 
  98 |   @Transactional
  99 |   public void deleteFlashcard(Long flashcardId, Long userId) {
 100 |     FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));
 101 |     
 102 |     if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
 103 |       throw new UnauthorizedObjectAccessException("Unauthorized to edit this flashcard");
 104 |     }
 105 |     
 106 |     flashcard.getDeckEntity().getFlashcards().remove(flashcard);
 107 |   }
 108 | 
 109 |   @Transactional
 110 |   public FlashcardDTO getFlashcardById(Long flashcardId, Long userId) {
 111 |     FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));
 112 |     
 113 |     if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
 114 |       throw new UnauthorizedObjectAccessException("Unauthorized to get this flashcard");
 115 |     }
 116 | 
 117 |     FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcard.getFlashcardType());
 118 | 
 119 |     return handler.entityToDTO(flashcard);
 120 |   }
 121 | 
 122 |   @Transactional
 123 |   public int evaluateAnswer(Long flashcardId, UserAnswerDTO answer, Long userId) {
 124 |     FlashcardEntity flashcard = flashcardRepository.findById(flashcardId).orElseThrow(() -> new ObjectNotFoundException("Flashcard not found"));
 125 |     if(!flashcard.getDeckEntity().getUserEntity().getId().equals(userId)) {
 126 |       throw new UnauthorizedObjectAccessException("Unauthorized to review this flashcard");
 127 |     }
 128 |     FlashcardTypeHandler<FlashcardDTO, FlashcardEntity, UserAnswerDTO> handler = handlerRegistry.getHandler(flashcard.getFlashcardType());
 129 |     return handler.evaluateAnswer(flashcard, answer);
 130 |   }
 131 | 
 132 |   @Transactional
 133 |   public List<FlashcardDTO> createFlashcardsFromSuggestions(List<FlashcardDTO> suggestions, Long deckId, Long userId) {
 134 |     DeckEntity deck = deckRepository.findById(deckId)
 135 |             .orElseThrow(() -> new ObjectNotFoundException("Deck not found with ID: " + deckId));
 136 | 
 137 |     if (!deck.getUserEntity().getId().equals(userId)) {
 138 |         throw new UnauthorizedObjectAccessException("Unauthorized: Deck does not belong to user " + userId);
 139 |     }
 140 |   
 141 |     List<FlashcardDTO> createdFlashcards = new ArrayList<>();
 142 |     for (FlashcardDTO suggestion : suggestions) {
 143 |       createFlashcard(suggestion, deckId);
 144 |       createdFlashcards.add(suggestion);
 145 |     }
 146 |     return createdFlashcards;
 147 |   }
 148 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/NoteService.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service;
   2 | 
   3 | import org.springframework.beans.factory.annotation.Autowired;
   4 | import org.springframework.data.domain.Page;
   5 | import org.springframework.data.domain.Pageable;
   6 | import org.springframework.data.jpa.domain.Specification;
   7 | import org.springframework.stereotype.Service;
   8 | import org.springframework.transaction.annotation.Transactional;
   9 | 
  10 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteDTO;
  11 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteSummaryDTO;
  12 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.NoteUpdateDTO;
  13 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;
  14 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  15 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
  16 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectNotFoundException;
  17 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.UnauthorizedObjectAccessException;
  18 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.NoteRepository;
  19 | import br.com.TrabalhoEngSoftwareFramework.framework.specification.NoteSpecificationBuilder;
  20 | 
  21 | @Service
  22 | public class NoteService {
  23 | 	
  24 | 	@Autowired
  25 | 	private NoteRepository noteRepository;
  26 | 	
  27 | 	public NoteService(NoteRepository noteRepository) {
  28 | 		this.noteRepository = noteRepository;
  29 | 	}
  30 | 	
  31 | 	@Transactional
  32 | 	public Long createNote(NoteDTO noteDTO, Long userId) {
  33 | 		NoteEntity note = new NoteEntity();
  34 | 		if(noteDTO.getTitle() == null || noteDTO.getTitle().trim().isEmpty()) {
  35 | 			throw new InvalidObjectDataException("Note title can't be empty");
  36 | 		}
  37 | 		note.setTitle(noteDTO.getTitle());
  38 | 		note.setSubtitle(noteDTO.getSubtitle());
  39 | 		note.setContent(noteDTO.getContent());
  40 | 		note.setUserEntity(new UserEntity(userId));
  41 | 		return noteRepository.save(note).getId();
  42 | 	}
  43 | 	
  44 | 	public Page<NoteSummaryDTO> listNotes(String title, Long userId, String sortType, Pageable pageable) {
  45 | 		NoteSpecificationBuilder builder = new NoteSpecificationBuilder(title);
  46 | 
  47 | 		builder.addSpecification("filterByTitle");
  48 | 		
  49 | 		if(sortType != null && !sortType.trim().isEmpty()) {
  50 |       builder.addSpecification(sortType); // Adiciona a ordenação nomeada
  51 |     }
  52 | 		
  53 | 		Specification<NoteEntity> specification = builder.build(userId, "userEntity");
  54 | 		
  55 | 		return noteRepository.findAll(specification, pageable).map(NoteSummaryDTO::new);
  56 | 	}
  57 | 	
  58 | 	@Transactional
  59 | 	public NoteDTO updateNote(Long noteId, NoteUpdateDTO updateDTO, Long userId) {
  60 | 		NoteEntity note = noteRepository.findById(noteId).orElseThrow(() -> new ObjectNotFoundException("Note not found"));
  61 | 		
  62 | 		if(!note.getUserEntity().getId().equals(userId)) {
  63 | 			throw new UnauthorizedObjectAccessException("Unauthorized to edit this note");
  64 | 		}
  65 | 		
  66 | 		if (updateDTO.getTitle() != null) {
  67 | 			if(updateDTO.getTitle().trim().isEmpty()) {
  68 | 				throw new InvalidObjectDataException("Title can't be empty");
  69 | 			}
  70 | 	        note.setTitle(updateDTO.getTitle());
  71 | 	    }
  72 | 
  73 | 	    if (updateDTO.getContent() != null) {
  74 | 	        note.setContent(updateDTO.getContent());
  75 | 	    }
  76 | 
  77 | 	    if (updateDTO.getSubtitle() != null) {
  78 | 	        note.setSubtitle(updateDTO.getSubtitle());
  79 | 	    }
  80 | 	    
  81 | 		return new NoteDTO(noteRepository.save(note));
  82 | 	}
  83 | 	
  84 | 	@Transactional
  85 | 	public void deleteNote(Long noteId, Long userId) {
  86 | 		NoteEntity note = noteRepository.findById(noteId).orElseThrow(() -> new ObjectNotFoundException("Note not found"));
  87 | 		if(!note.getUserEntity().getId().equals(userId)) {
  88 | 			throw new UnauthorizedObjectAccessException("Unauthorized to delete this note");
  89 | 		}
  90 | 		noteRepository.delete(note);
  91 | 	}
  92 | 	
  93 | 	@Transactional(readOnly = true)
  94 | 	public NoteDTO getNoteById(Long noteId, Long userId) {
  95 | 		NoteEntity note = noteRepository.findById(noteId).orElseThrow(() -> new ObjectNotFoundException("Note not found"));
  96 | 		if(!note.getUserEntity().getId().equals(userId)) {
  97 | 			throw new UnauthorizedObjectAccessException("Unauthorized to view this note");
  98 | 		}
  99 | 		return new NoteDTO(note);
 100 | 	}
 101 | 	
 102 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/SourceService.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service;
   2 | 
   3 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.SourceDTO;
   4 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;
   5 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.SourceEntity;
   6 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.FileStorageException;
   7 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectDeletionException;
   8 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectNotFoundException;
   9 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.StorageInitializationException;
  10 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.UnauthorizedObjectAccessException;
  11 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.NoteRepository;
  12 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.SourceRepository;
  13 | import org.springframework.beans.factory.annotation.Autowired;
  14 | import org.springframework.stereotype.Service;
  15 | import org.springframework.transaction.annotation.Transactional;
  16 | import org.springframework.web.multipart.MultipartFile;
  17 | 
  18 | import java.io.IOException;
  19 | import java.nio.file.Files;
  20 | import java.nio.file.Path;
  21 | import java.nio.file.Paths;
  22 | import java.util.List;
  23 | import java.util.stream.Collectors;
  24 | 
  25 | @Service
  26 | public class SourceService {
  27 | 
  28 |     @Autowired
  29 |     private SourceRepository sourceRepository;
  30 | 
  31 |     @Autowired
  32 |     private NoteRepository noteRepository; // Para encontrar a nota associada ao arquivo
  33 | 
  34 |     // TODO: Configurar o diretório de upload de forma mais robusta (ex: usando propriedades do Spring)
  35 |     private final String uploadDir = "./uploads"; // FIXME: Temporário, deve ser configurado corretamente
  36 | 
  37 |     public SourceService() {
  38 |         // Criar o diretório de upload se não existir
  39 |         try {
  40 |             Files.createDirectories(Paths.get(uploadDir));
  41 |         } catch (IOException e) {
  42 |             // Tratamento básico de erro
  43 |             e.printStackTrace();
  44 |             throw new StorageInitializationException("Failed to initialize storage directory");
  45 |         }
  46 |     }
  47 | 
  48 |     @Transactional
  49 |     public SourceDTO uploadSource(Long noteId, Long userId, MultipartFile file) {
  50 |         NoteEntity note = noteRepository.findById(noteId)
  51 |                 .orElseThrow(() -> new ObjectNotFoundException("Note not found"));
  52 | 
  53 |         if (!note.getUserEntity().getId().equals(userId)) {
  54 |             throw new UnauthorizedObjectAccessException("Unauthorized to add source to this note");
  55 |         }
  56 | 
  57 |         try {
  58 |             String originalFileName = file.getOriginalFilename();
  59 |             String uniqueFileName = System.currentTimeMillis() + "_" + originalFileName;
  60 |             Path filePath = Paths.get(uploadDir, uniqueFileName);
  61 | 
  62 |             Files.copy(file.getInputStream(), filePath);
  63 | 
  64 |             SourceEntity source = new SourceEntity();
  65 |             source.setFileName(originalFileName);
  66 |             source.setFilePath(filePath.toString());
  67 |             source.setNoteEntity(note);
  68 | 
  69 |             SourceEntity savedSource = sourceRepository.save(source);
  70 | 
  71 |             return new SourceDTO(savedSource);
  72 | 
  73 |         } catch (IOException e) {
  74 |             throw new FileStorageException("Failed to upload file");
  75 |         }
  76 |     }
  77 | 
  78 |     @Transactional(readOnly = true)
  79 |     public List<SourceDTO> getSourcesByNoteId(Long noteId, Long userId) {
  80 |         NoteEntity note = noteRepository.findById(noteId)
  81 |                 .orElseThrow(() -> new ObjectNotFoundException("Note not found"));
  82 | 
  83 |         if (!note.getUserEntity().getId().equals(userId)) {
  84 |             throw new UnauthorizedObjectAccessException("Unauthorized to view sources for this note");
  85 |         }
  86 | 
  87 |         List<SourceEntity> sources = sourceRepository.findByNoteEntityId(noteId);
  88 |         return sources.stream()
  89 |                 .map(SourceDTO::new)
  90 |                 .collect(Collectors.toList());
  91 |     }
  92 | 
  93 |     @Transactional
  94 |     public void deleteSource(Long sourceId, Long userId) {
  95 |         SourceEntity source = sourceRepository.findById(sourceId)
  96 |                 .orElseThrow(() -> new ObjectNotFoundException("Source not found"));
  97 | 
  98 |         if (!source.getNoteEntity().getUserEntity().getId().equals(userId)) {
  99 |             throw new UnauthorizedObjectAccessException("Unauthorized to delete this source");
 100 |         }
 101 | 
 102 |         try {
 103 |             Path filePath = Paths.get(source.getFilePath());
 104 |             Files.deleteIfExists(filePath);
 105 |             sourceRepository.delete(source);
 106 |         } catch (IOException e) {
 107 |             throw new ObjectDeletionException("Failed to delete file " + source.getFileName());
 108 |         }
 109 |     }
 110 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/TopicService.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service;
   2 | 
   3 | import java.util.Collection;
   4 | import java.util.HashMap;
   5 | import java.util.Map;
   6 | 
   7 | import org.springframework.stereotype.Service;
   8 | 
   9 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.UnexpectedFailureException;
  10 | 
  11 | @Service
  12 | public class TopicService {
  13 |   
  14 |   private Map<String, Long> topics =  new HashMap<>();
  15 | 
  16 |   protected String capitalizeFirstLetter(String topic) {
  17 |     return topic.substring(0, 1).toUpperCase() + topic.substring(1).toLowerCase();
  18 |   }
  19 | 
  20 |   protected Boolean exists(String topic) {
  21 |     return topics.containsKey(topic);
  22 |   }
  23 | 
  24 |   public void addTopic(String topic) {
  25 |     if(topic == null || topic.trim().isEmpty()) {
  26 |       return;
  27 |     } else {
  28 |       String capitalizedTopic = capitalizeFirstLetter(topic);
  29 |       if(exists(capitalizedTopic)) {
  30 |         topics.put(capitalizedTopic, topics.get(capitalizedTopic)+1); 
  31 |       } else {
  32 |         topics.put(capitalizedTopic, 1L);
  33 |       }
  34 |     }
  35 |   }
  36 | 
  37 |   public void removeTopic(String topic) {
  38 |     if(topic == null || topic.trim().isEmpty()) {
  39 |       return;
  40 |     } else {
  41 |       String capitalizedTopic = capitalizeFirstLetter(topic);
  42 |       if(exists(capitalizedTopic)) {
  43 |         topics.put(capitalizedTopic, topics.get(capitalizedTopic)-1);
  44 |         if(topics.get(capitalizedTopic) == 0) topics.remove(capitalizedTopic);
  45 |       } else {
  46 |         throw new UnexpectedFailureException("Error removing topic");
  47 |       }
  48 |     }
  49 |   }
  50 | 
  51 |   public void updateTopic(String oldTopic, String newTopic) {
  52 |     removeTopic(oldTopic);
  53 |     addTopic(newTopic);
  54 |   }
  55 | 
  56 |   public Collection<String> getAllTopics() {
  57 |     return topics.keySet();
  58 |   }
  59 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/UserService.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service;
   2 | 
   3 | import org.springframework.beans.factory.annotation.Autowired;
   4 | import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
   5 | import org.springframework.stereotype.Service;
   6 | import org.springframework.transaction.annotation.Transactional;
   7 | 
   8 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.UpdatePasswordDTO;
   9 | import br.com.TrabalhoEngSoftwareFramework.framework.dto.UserDTO;
  10 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.UserEntity;
  11 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.IncorrectPasswordException;
  12 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
  13 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.ObjectNotFoundException;
  14 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.PasswordMismatchException;
  15 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.DeckRepository;
  16 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.NoteRepository;
  17 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.UserRepository;
  18 | 
  19 | @Service
  20 | public class UserService {
  21 | 	
  22 | 	@Autowired
  23 | 	private UserRepository userRepository;
  24 | 
  25 | 	@Autowired
  26 | 	private NoteRepository noteRepository;
  27 | 
  28 | 	@Autowired
  29 | 	private DeckRepository deckRepository;
  30 | 
  31 | 	public 	UserService(UserRepository userRepository) {
  32 | 		this.userRepository = userRepository;
  33 | 	}
  34 | 	
  35 | 	public UserDTO getUserById(Long userId) {
  36 | 		UserEntity user = userRepository.findById(userId).orElseThrow(() -> new ObjectNotFoundException("User not found"));
  37 | 		return new UserDTO(user);
  38 | 	}
  39 | 
  40 | 	@Transactional
  41 | 	public UserDTO updateUserPersonalInformations(UserDTO userDTO, Long userId) {
  42 | 		UserEntity user = userRepository.findById(userId).orElseThrow(() -> new ObjectNotFoundException("User not found"));
  43 | 		if(userDTO.getFullName() == null || userDTO.getFullName().trim().isEmpty()) {
  44 |       throw new InvalidObjectDataException("User full name can't be empty");
  45 |     }
  46 | 		if(userDTO.getUsername() == null || userDTO.getUsername().trim().isEmpty()) {
  47 |       throw new InvalidObjectDataException("Username can't be empty");
  48 |     }
  49 | 		if(userDTO.getEmail() == null || userDTO.getEmail().trim().isEmpty()) {
  50 |       throw new InvalidObjectDataException("User email can't be empty");
  51 |     }
  52 | 		user.setFullName(userDTO.getFullName());
  53 | 		user.setUsername(userDTO.getUsername());
  54 | 		user.setEmail(userDTO.getEmail());
  55 | 		return new UserDTO(userRepository.save(user));
  56 | 	}
  57 | 
  58 | 	@Transactional
  59 | 	public void updateUserPassword(UpdatePasswordDTO updatePasswordDTO, Long userId) {
  60 | 		UserEntity user = userRepository.findById(userId).orElseThrow(() -> new ObjectNotFoundException("User not found"));
  61 | 
  62 | 		if(updatePasswordDTO.getCurrentPassword().isEmpty()) throw new InvalidObjectDataException("Current password can't be empty");
  63 | 		if(updatePasswordDTO.getNewPassword().isEmpty()) throw new InvalidObjectDataException("New password can't be empty");
  64 | 		if(updatePasswordDTO.getConfirmNewPassword().isEmpty()) throw new InvalidObjectDataException("New confirmation password can't be empty");
  65 | 
  66 | 		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
  67 | 		if(!passwordEncoder.matches(updatePasswordDTO.getCurrentPassword(), user.getPassword())) {
  68 | 			throw new IncorrectPasswordException("Current password is incorrect");
  69 | 		}
  70 | 		if(!updatePasswordDTO.getNewPassword().equals(updatePasswordDTO.getConfirmNewPassword())) throw new PasswordMismatchException("Passwords do not match");
  71 | 		String newEncryptedPassword = new BCryptPasswordEncoder().encode(updatePasswordDTO.getNewPassword());
  72 | 		user.setPassword(newEncryptedPassword);
  73 | 		userRepository.save(user);
  74 | 	}
  75 | 	
  76 | 	@Transactional
  77 | 	public void deleteUser(Long userId) {
  78 | 		UserEntity user = userRepository.findById(userId).orElseThrow(() -> new ObjectNotFoundException("User not found"));
  79 | 		noteRepository.deleteByUserEntityId(userId);
  80 | 		deckRepository.deleteByUserEntityId(userId);
  81 | 		userRepository.delete(user);
  82 | 	}
  83 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/prompt/PromptBuilder.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service.prompt;
   2 | 
   3 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.SourceEntity;
   4 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.NoteRepository;
   5 | import br.com.TrabalhoEngSoftwareFramework.framework.repository.SourceRepository;
   6 | 
   7 | import org.springframework.ai.chat.messages.AssistantMessage;
   8 | import org.springframework.ai.chat.messages.Message;
   9 | import org.springframework.ai.chat.messages.Media;
  10 | import org.springframework.ai.chat.messages.SystemMessage;
  11 | import org.springframework.ai.chat.messages.UserMessage;
  12 | import org.springframework.ai.chat.prompt.ChatOptions;
  13 | import org.springframework.ai.chat.prompt.Prompt;
  14 | import org.springframework.beans.factory.annotation.Autowired;
  15 | import org.springframework.context.annotation.Scope;
  16 | import org.springframework.core.io.ClassPathResource;
  17 | import org.springframework.stereotype.Component;
  18 | import org.springframework.util.MimeType;
  19 | import org.springframework.util.MimeTypeUtils;
  20 | 
  21 | import java.io.IOException;
  22 | import java.nio.file.Files;
  23 | import java.nio.file.Paths;
  24 | import java.util.List;
  25 | 
  26 | 
  27 | /* Roles:
  28 |  * System: Guia o comportamento da IA e estilo de resposta, definindo parâmetros e regras para a forma que a LLM deve interpretar e responder a uma mensagem.
  29 |  * User: Entradas do Usuário. Perguntas, afirmações e comandos que vão ser o principal determinante na resposta final da IA
  30 |  * Assistant: Mantém rastreio das respostas anteriores da LLM para manter o fluxo de uma conversa (em casos de chats ou requests que precisem de continuidade entre si)
  31 |  * Function/ToolResponse: Tarefas Específicas. Dá acesso à ferramentas para a LLM, como cálculos, busca na web, etc...
  32 | */
  33 | //TODO: Adicionar suporte a Function-Calling
  34 | @Component
  35 | @Scope("prototype")
  36 | public class PromptBuilder {
  37 | 
  38 |     private NoteRepository noteRepository;
  39 |     private SourceRepository sourceRepository;
  40 | 
  41 |     private List<Message> promptMessages;
  42 |     private String systemMessageContent;
  43 |     private List<UserMessage> extraContext;
  44 |     private ChatOptions chatOptions;
  45 |     private boolean hasUserMessage = false;
  46 | 
  47 |     @Autowired
  48 |     public void setNoteRepository(NoteRepository noteRepository) {
  49 |         this.noteRepository = noteRepository;
  50 |     }
  51 | 
  52 |     @Autowired
  53 |     public void setSourceRepository(SourceRepository sourceRepository) {
  54 |         this.sourceRepository = sourceRepository;
  55 |     }
  56 | 
  57 |     public PromptBuilder withSystemMessage(String systemMessage) {
  58 |         systemMessageContent = systemMessage;
  59 |         return this;
  60 |     }
  61 | 
  62 |     public PromptBuilder withUserMessage(String userMessage) {
  63 |         promptMessages.add(new UserMessage(userMessage));
  64 |         hasUserMessage = true;
  65 |         return this;
  66 |     }
  67 |     
  68 |     public PromptBuilder withAssistantMessage(String assistantMessage) {
  69 |         promptMessages.add(new AssistantMessage(assistantMessage));
  70 |         return this;
  71 |     }
  72 | 
  73 |     public PromptBuilder withOptions(ChatOptions modelOptions) {
  74 |         chatOptions = modelOptions;
  75 |         return this;
  76 |     }
  77 | 
  78 |     public PromptBuilder withNoteContext(Long noteId, Long userId) {
  79 |         if (noteId != null) {
  80 |             StringBuilder contextBuilder = new StringBuilder();
  81 |             noteRepository.findById(noteId).ifPresent(note -> {
  82 |                 if (note.getUserEntity().getId().equals(userId)) {
  83 |                     contextBuilder.append("## Context from Note (ID: ").append(noteId).append("):\n");
  84 |                     contextBuilder.append("### Title: ").append(note.getTitle()).append("\n");
  85 |                     if (note.getSubtitle() != null && !note.getSubtitle().isEmpty()) {
  86 |                         contextBuilder.append("#### Subtitle: ").append(note.getSubtitle()).append("\n");
  87 |                     }
  88 |                     contextBuilder.append("### Content:\n").append(note.getContent()).append("\n\n---\n\n");
  89 |                 } else {
  90 |                     System.err.println("User " + userId + " attempted to access unauthorized note " + noteId);
  91 |                 }
  92 |             });
  93 |         }
  94 |         return this;
  95 |     }
  96 | 
  97 |     public PromptBuilder withSourceContext(List<Long> sourceIds, Long noteId, Long userId) {
  98 |         if (sourceIds != null && !sourceIds.isEmpty()) {
  99 |             StringBuilder contextBuilder = new StringBuilder();
 100 |             contextBuilder.append("## Context from Uploaded Sources:\n");
 101 |             List<SourceEntity> sources = sourceRepository.findAllById(sourceIds);
 102 |             for (SourceEntity source : sources) {
 103 |                 if (source.getNoteEntity().getUserEntity().getId().equals(userId)) {
 104 |                     if (noteId == null || source.getNoteEntity().getId().equals(noteId)) {
 105 |                         contextBuilder.append("### Source (File: ").append(source.getFileName()).append("):\n");
 106 |                         //TODO: Utilizar RAG para arquivos grandes
 107 |                         try {
 108 |                             byte[] fileData = new ClassPathResource(source.getFilePath()).getContentAsByteArray();
 109 |                             String mimeTypeString = Files.probeContentType(Paths.get(source.getFilePath()));
 110 |                             MimeType mimeType = MimeTypeUtils.parseMimeType(mimeTypeString);
 111 |                             //FIXME: Esse construtor de Media é deprecado, ver docs de novas versões para substituir
 112 |                             extraContext.add(new UserMessage(contextBuilder.toString(), new Media(mimeType, fileData)));
 113 |                         } catch (IOException e) {
 114 |                             System.err.println("Error processing file: " + source.getFilePath() + " - " + e.getMessage());
 115 |                         }
 116 |                     }
 117 |                 } else {
 118 |                     System.err.println("User " + userId + " attempted to access unauthorized source " + source.getId());
 119 |                 }
 120 |             }
 121 |             contextBuilder.append("---\n\n");
 122 |         }
 123 |         return this;
 124 |     }
 125 | 
 126 |     public PromptBuilder forFlashcardGeneration(String noteContent, int count) { //FIXME: Prompt de Demo pra usar no Kairo por enquanto, remover depois
 127 |         withSystemMessage("You are an AI assistant specialized in creating educational flashcards. " +
 128 |                 "Based on the provided text, generate exactly " + count + " flashcards. " +
 129 |                 "Each flashcard must have a 'front' (a question, term, or concept) and a 'back' (the corresponding answer, definition, or explanation). " +
 130 |                 "The 'front' should be concise and suitable for a flashcard. The 'back' should also be concise but comprehensive enough to be useful. " +
 131 |                 "IMPORTANT: Respond ONLY with a valid JSON array of objects. Each object must have two keys: \"front\" and \"back\". Do not include any other text, explanations, or introductions in your response. " +
 132 |                 "Example format: [{\"front\": \"What is photosynthesis?\", \"back\": \"The process by which green plants use sunlight, water, and carbon dioxide to create their own food.\"}, {\"front\": \"Capital of France?\", \"back\": \"Paris\"}]");
 133 |         withUserMessage("Here is the text to generate flashcards from:\n\n" + noteContent);
 134 |         return this;
 135 |     }
 136 | 
 137 |     public Prompt build() {
 138 |         String effectiveSystemPrompt = systemMessageContent;
 139 |         
 140 |         if (effectiveSystemPrompt != null && !effectiveSystemPrompt.trim().isEmpty()) {
 141 |             promptMessages.add(new SystemMessage(effectiveSystemPrompt));
 142 |         }
 143 |         if (!hasUserMessage) {
 144 |             promptMessages.add(new UserMessage("Please provide a response based on the context."));
 145 |         }
 146 |         if (!extraContext.isEmpty()) { 
 147 |             //TODO: Experimentar diferentes ordens de mensagens, colocar o contexto adicional no final pode fazer com que a LLM acabe ignorando o input do próprio usuário (que ficaria no meio)
 148 |             //OBS: Talvez também seja melhor deixar antes das mensagens do usuário para permitir caching do prompt.
 149 |             promptMessages.addAll(extraContext);   
 150 |         }
 151 | 
 152 |         if (chatOptions != null) {
 153 |             return new Prompt(promptMessages, chatOptions);
 154 |         } else {
 155 |             return new Prompt(promptMessages);
 156 |         }
 157 |     }
 158 | }
 159 | 

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/service/provider/AiProvider.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.service.provider;
   2 | 
   3 | import org.springframework.ai.chat.client.ChatClient;
   4 | import org.springframework.ai.chat.model.ChatResponse;
   5 | import org.springframework.ai.chat.prompt.Prompt;
   6 | import org.springframework.ai.converter.BeanOutputConverter;
   7 | import org.springframework.stereotype.Service;
   8 | import reactor.core.publisher.Flux;
   9 | import org.springframework.ai.chat.messages.UserMessage;
  10 | 
  11 | @Service
  12 | public class AiProvider {
  13 | 
  14 |     public String getCompletion(Prompt prompt, ChatClient chatClient) {
  15 |         return chatClient.prompt(prompt).call().content();
  16 |     }
  17 | 
  18 |     public <T> T getJsonCompletion(Prompt prompt, Class<T> targetType, ChatClient chatClient) { //FIXME: Por enquanto só aceita output para uma classe, não aceita listas, maps, ou outros tipos que precisem de converters diferentes
  19 |         BeanOutputConverter<T> outputConverter = new BeanOutputConverter<>(targetType);
  20 |         String format = outputConverter.getFormat();
  21 | 
  22 |         String userTextWithFormat = prompt.getInstructions().get(0).getContent() + "\n" + format;
  23 |         Prompt newPrompt = new Prompt(new UserMessage(userTextWithFormat));
  24 | 
  25 |         ChatResponse response = chatClient.prompt(newPrompt).call().chatResponse();
  26 |         return outputConverter.convert(response.getResult().getOutput().getContent());
  27 |     }
  28 | 
  29 |     public Flux<String> getStreamCompletion(Prompt prompt, ChatClient chatClient) {
  30 |         return chatClient.prompt(prompt).stream().content();
  31 |     }
  32 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/specification/DeckSpecificationBuilder.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.specification;
   2 | 
   3 | import org.springframework.beans.factory.config.ConfigurableBeanFactory;
   4 | import org.springframework.context.annotation.Scope;
   5 | import org.springframework.stereotype.Component;
   6 | 
   7 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.DeckEntity;
   8 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
   9 | import jakarta.persistence.criteria.Expression;
  10 | import jakarta.persistence.criteria.JoinType;
  11 | import jakarta.persistence.criteria.ListJoin;
  12 | import jakarta.persistence.criteria.Predicate;
  13 | 
  14 | @Component
  15 | @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  16 | public class DeckSpecificationBuilder extends SpecificationBuilder<DeckEntity> {
  17 |   private String title;
  18 |   private String topic;
  19 | 
  20 |   @SuppressWarnings("null")
  21 |   public DeckSpecificationBuilder(String title, String topic) {
  22 |     super();
  23 |     this.title = title;
  24 |     this.topic = topic;
  25 | 
  26 |     buildSpecification("filterByTitle", (root, query, criteriaBuilder)-> {
  27 | 			Predicate titlePredicate = criteriaBuilder.conjunction();
  28 | 			if(this.title != null && !this.title.isEmpty()) {
  29 | 				titlePredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("title")), "%" + this.title.toLowerCase() + "%");
  30 | 			}
  31 | 			return criteriaBuilder.and(titlePredicate);
  32 | 		});
  33 | 
  34 |     buildSpecification("filterByTopic", (root, query, criteriaBuilder)-> {
  35 | 			Predicate topicPredicate = criteriaBuilder.conjunction();
  36 | 			if(this.topic != null && !this.topic.isEmpty() && !topic.equals("No filter")) {
  37 | 				topicPredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("topic")), this.topic.toLowerCase());
  38 | 			}
  39 | 			return criteriaBuilder.and(topicPredicate);
  40 | 		});
  41 | 
  42 |     buildSpecification("createdAtAsc", (root, query, criteriaBuilder) -> {
  43 |       query.orderBy(criteriaBuilder.asc(root.get("createdAt")));
  44 |       return criteriaBuilder.conjunction();
  45 |     });
  46 | 
  47 |     buildSpecification("createdAtDesc", (root, query, criteriaBuilder) -> {
  48 |       query.orderBy(criteriaBuilder.desc(root.get("createdAt")));
  49 |       return criteriaBuilder.conjunction();
  50 |     });
  51 | 
  52 |     buildSpecification("lastReviewedAtAsc", (root, query, criteriaBuilder) -> {
  53 | 	    Expression<Object> nullsLast = criteriaBuilder.selectCase()
  54 | 	        .when(criteriaBuilder.isNull(root.get("lastReviewedAt")), 1)
  55 | 	        .otherwise(0);
  56 | 
  57 | 	    query.orderBy(
  58 | 	        criteriaBuilder.asc(nullsLast),
  59 | 	        criteriaBuilder.desc(root.get("lastReviewedAt"))
  60 | 	    );
  61 | 	    return null;
  62 | 	  });
  63 |         
  64 |     buildSpecification("lastReviewedAtDesc", (root, query, criteriaBuilder) -> {
  65 |       query.orderBy(criteriaBuilder.asc(root.get("lastReviewedAt")));
  66 |       return null;
  67 |     });
  68 | 
  69 |     buildSpecification("totalFlashcardsDesc", (root, query, criteriaBuilder) -> {
  70 | 			ListJoin<DeckEntity, FlashcardEntity> flashcardJoin = root.joinList("flashcards", JoinType.LEFT);
  71 | 			query.groupBy(root.get("id"));
  72 | 			query.orderBy(criteriaBuilder.desc(criteriaBuilder.count(flashcardJoin)));
  73 | 			return null;		
  74 | 		});
  75 |   }
  76 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/specification/FlashcardSpecificationBuilder.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.specification; 
   2 | 
   3 | import org.springframework.beans.factory.config.ConfigurableBeanFactory;
   4 | import org.springframework.context.annotation.Scope;
   5 | import org.springframework.stereotype.Component;
   6 | 
   7 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.FlashcardEntity;
   8 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
   9 | import br.com.TrabalhoEngSoftwareFramework.framework.handler.FlashcardTypeSearchHandler;
  10 | import br.com.TrabalhoEngSoftwareFramework.framework.handler.FlashcardTypeSearchRegistry;
  11 | import jakarta.persistence.criteria.Expression;
  12 | import java.util.Optional;
  13 | 
  14 | @Component
  15 | @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  16 | public class FlashcardSpecificationBuilder extends SpecificationBuilder<FlashcardEntity> {
  17 |   
  18 |     private final FlashcardTypeSearchRegistry searchRegistry; // Injeta o registry
  19 |     
  20 |     @SuppressWarnings("null")
  21 |     public FlashcardSpecificationBuilder(FlashcardTypeSearchRegistry searchRegistry) {
  22 |         super(); 
  23 |         this.searchRegistry = searchRegistry;
  24 | 
  25 |         // ====================================================================
  26 |         // ORDENAÇÕES PADRÃO/FRAMEWORK-LEVEL REGISTRADAS AQUI
  27 |         // ====================================================================
  28 |         buildSpecification("createdAtAsc", (root, query, criteriaBuilder) -> {
  29 |           query.orderBy(criteriaBuilder.asc(root.get("createdAt")));
  30 |           return criteriaBuilder.conjunction();
  31 |         });
  32 | 
  33 |         buildSpecification("createdAtDesc", (root, query, criteriaBuilder) -> {
  34 |           query.orderBy(criteriaBuilder.desc(root.get("createdAt")));
  35 |           return criteriaBuilder.conjunction();
  36 |         });
  37 | 
  38 |         buildSpecification("lastReviewedAtAsc", (root, query, criteriaBuilder) -> {
  39 | 	        Expression<Object> nullsLast = criteriaBuilder.selectCase()
  40 | 	            .when(criteriaBuilder.isNull(root.get("lastReviewedAt")), 1)
  41 | 	            .otherwise(0);
  42 | 
  43 | 	        query.orderBy(
  44 | 	            criteriaBuilder.asc(nullsLast),
  45 | 	            criteriaBuilder.desc(root.get("lastReviewedAt"))
  46 | 	        );
  47 | 	        return null;
  48 | 	      });
  49 |         
  50 |         buildSpecification("lastReviewedAtDesc", (root, query, criteriaBuilder) -> {
  51 |           query.orderBy(criteriaBuilder.asc(root.get("lastReviewedAt")));
  52 |           return null;
  53 |         });
  54 |     }
  55 | 
  56 |     /**
  57 |      * Adiciona um filtro de palavra-chave, delegando a lógica específica do tipo para o registro de handlers.
  58 |      *
  59 |      * @param word A palavra-chave a ser pesquisada.
  60 |      * @return O próprio builder para encadeamento.
  61 |      */
  62 |     public FlashcardSpecificationBuilder addWordFilter(String word) {
  63 |         if (word == null || word.trim().isEmpty()) {
  64 |             return this;
  65 |         }
  66 | 
  67 |         super.specification = super.specification.and(
  68 |             (root, query, criteriaBuilder) -> {
  69 |                 String flashcardType = (root.get("flashcardType").as(String.class)).toString(); 
  70 |                 
  71 |                 // Use o registry para encontrar o handler apropriado
  72 |                 Optional<FlashcardTypeSearchHandler> handlerOptional = this.searchRegistry.getHandler(flashcardType);
  73 | 
  74 |                 if (handlerOptional.isPresent()) {
  75 |                   FlashcardTypeSearchHandler handler = handlerOptional.get();
  76 |                   // Delega para o handler específico para obter a predicate
  77 |                   return handler.getWordSearchPredicate(root, criteriaBuilder, word);
  78 |                 } else {
  79 |                   // Nenhum handler específico encontrado para este tipo, exclua da busca por palavra-chave
  80 |                   throw new InvalidObjectDataException("Aviso: Nenhum FlashcardTypeSearchHandler encontrado para o tipo: " + flashcardType + ". Flashcards deste tipo serão excluídos da busca por palavra-chave."); 
  81 |                 }
  82 |             }
  83 |         );
  84 |         return this; 
  85 |     }
  86 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/specification/NoteSpecificationBuilder.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.specification;
   2 | 
   3 | import org.springframework.beans.factory.config.ConfigurableBeanFactory;
   4 | import org.springframework.context.annotation.Scope;
   5 | import org.springframework.stereotype.Component;
   6 | 
   7 | import br.com.TrabalhoEngSoftwareFramework.framework.entity.NoteEntity;
   8 | import jakarta.persistence.criteria.Predicate;
   9 | 
  10 | @Component
  11 | @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  12 | public class NoteSpecificationBuilder extends SpecificationBuilder<NoteEntity> {
  13 |   private String title;
  14 | 	
  15 |   @SuppressWarnings("null")
  16 | 	public NoteSpecificationBuilder(String title) {
  17 |     super();
  18 |     this.title = title;
  19 | 
  20 |     buildSpecification("filterByTitle", (root, query, criteriaBuilder)-> {
  21 | 			Predicate titlePredicate = criteriaBuilder.conjunction();
  22 | 			if(this.title != null && !this.title.isEmpty()) {
  23 | 				titlePredicate = criteriaBuilder.like(criteriaBuilder.lower(root.get("title")), "%" + this.title.toLowerCase() + "%");
  24 | 			}
  25 | 			return criteriaBuilder.and(titlePredicate);
  26 | 		});
  27 | 
  28 |     buildSpecification("createdAtDesc", (root, query, criteriaBuilder) -> {
  29 | 			query.orderBy(criteriaBuilder.desc(root.get("createdAt")));
  30 | 			return null;
  31 | 		});
  32 | 
  33 |     buildSpecification("createdAtAsc", (root, query, criteriaBuilder) -> {
  34 | 			query.orderBy(criteriaBuilder.asc(root.get("createdAt")));
  35 | 			return null;
  36 | 		});
  37 | 
  38 |     buildSpecification("updatedAtDesc", (root, query, criteriaBuilder) -> {
  39 | 			query.orderBy(criteriaBuilder.desc(root.get("updatedAt")));
  40 | 			return null;
  41 | 		});
  42 | 		
  43 |     buildSpecification("updatedAtAsc", (root, query, criteriaBuilder) -> {
  44 | 			query.orderBy(criteriaBuilder.asc(root.get("updatedAt")));
  45 | 			return null;
  46 | 		});
  47 |   }
  48 | }

```

`chatbot/src/main/java/br/com/TrabalhoEngSoftwareFramework/framework/specification/SpecificationBuilder.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework.specification;
   2 | 
   3 | import java.util.HashMap;
   4 | import java.util.Map;
   5 | 
   6 | import org.springframework.data.jpa.domain.Specification;
   7 | 
   8 | import br.com.TrabalhoEngSoftwareFramework.framework.exception.InvalidObjectDataException;
   9 | 
  10 | public abstract class SpecificationBuilder<T> {
  11 |   protected Specification<T> specification;
  12 |   protected Map<String, Specification<T>> specifications;
  13 |   
  14 |   public SpecificationBuilder() {
  15 |     this.specification = Specification.where(null);
  16 |     this.specifications = new HashMap<>();
  17 |   }
  18 | 
  19 |   public void addSpecification(String specificationName) {
  20 |     this.specification = this.specification.and(specifications.get(specificationName));
  21 |   } 
  22 | 
  23 |   protected void buildSpecification(String specificationName, Specification<T> spec) {
  24 |     if(spec != null) specifications.put(specificationName, spec);
  25 |     else throw new InvalidObjectDataException("It is necessary to place a Specification<T> not null to build the specification");
  26 |   }
  27 | 
  28 |   public Specification<T> build(Long parentId, String parentEntity) {
  29 |     if(parentId != null  && parentEntity != null) {
  30 |       return this.specification.and((root, query, criteriaBuilder) -> 
  31 |         criteriaBuilder.equal(root.get(parentEntity).get("id"), parentId)
  32 |       );
  33 |     }
  34 |     return this.specification;
  35 |   }
  36 | }

```

`chatbot/src/main/resources/application.properties`:

```properties
   1 | spring.application.name=chatbot
   2 | spring.datasource.url=jdbc:postgresql://localhost:5432/chatbot
   3 | spring.datasource.username=postgres
   4 | spring.datasource.password=password
   5 | 
   6 | spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
   7 | spring.jpa.hibernate.ddl-auto=update
   8 | spring.jpa.show-sql=true
   9 | 
  10 | api.security.token.secret=${JWT_SECRET:mySecretKey}
  11 | 
  12 | spring.ai.openai.api-key=${OPENAI_API_KEY}
  13 | spring.ai.openai.chat.options.model=gpt-4.1-nano
  14 | 
  15 | spring.ai.anthropic.api-key=${ANTHROPIC_API_KEY}
  16 | spring.ai.anthropic.chat.options.model=claude-3-5-haiku-latest
  17 | 
  18 | spring.ai.vertex.ai.gemini.project-id=${VERTEX_AI_GEMINI_PROJECT_ID}
  19 | spring.ai.vertex.ai.gemini.location=${VERTEX_AI_GEMINI_LOCATION}
  20 | spring.ai.vertex.ai.gemini.chat.options.model=gemini-2.5-flash-lite-preview-06-17

```

`chatbot/src/test/java/br/com/TrabalhoEngSoftwareFramework/framework/ChatbotApplicationTests.java`:

```java
   1 | package br.com.TrabalhoEngSoftwareFramework.framework;
   2 | 
   3 | import org.junit.jupiter.api.Test;
   4 | import org.springframework.boot.test.context.SpringBootTest;
   5 | 
   6 | @SpringBootTest
   7 | class ChatbotApplicationTests {
   8 | 
   9 | 	@Test
  10 | 	void contextLoads() {
  11 | 	}
  12 | 
  13 | }

```

`chatbot/src/test/resource/application.properties`:

```properties
   1 | # Configuração para banco de dados H2 em memória para testes
   2 | spring.datasource.url=jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
   3 | spring.datasource.driverClassName=org.h2.Driver
   4 | spring.datasource.username=sa
   5 | spring.datasource.password=password
   6 | spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
   7 | spring.jpa.hibernate.ddl-auto=create-drop # Cria o schema ao iniciar o teste e o apaga ao final
   8 | spring.jpa.show-sql=true
   9 | spring.jpa.properties.hibernate.format_sql=true

```