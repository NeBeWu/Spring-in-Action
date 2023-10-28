FROM mcr.microsoft.com/devcontainers/java:1-21-bullseye

ARG INSTALL_MAVEN="true"
ARG MAVEN_VERSION=""

ARG INSTALL_GRADLE="false"
ARG GRADLE_VERSION=""

# This code ensures that the script below will have time to run. 
RUN if [ "${INSTALL_MAVEN}" = "true" ] || [ "${INSTALL_GRADLE}" = "true" ]; then su vscode -c "umask 0002 && \
    sed -i 's/sdkman_curl_connect_timeout=.*/sdkman_curl_connect_timeout=30/' /usr/local/sdkman/etc/config && \
    sed -i 's/sdkman_curl_max_time=.*/sdkman_curl_max_time=50/' /usr/local/sdkman/etc/config"; fi

RUN if [ "${INSTALL_MAVEN}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && \
    sdk install maven"; fi \
    && if [ "${INSTALL_GRADLE}" = "true" ]; then su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && \
    sdk install gradle \"${GRADLE_VERSION}\""; fi

# [Optional] Uncomment this section to install additional OS packages.
# RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
#     && apt-get -y install --no-install-recommends <your-package-list-here>

# [Optional] Uncomment this line to install global node packages.
# RUN su vscode -c "source /usr/local/share/nvm/nvm.sh && npm install -g <your-package-here>" 2>&1
