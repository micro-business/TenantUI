FROM microbusinesses/uihost-service
MAINTAINER microbusinesses.inc@gmail.com
ADD resources/public/prod/js/main.js /www/js/
CMD ["/UIHostService"]